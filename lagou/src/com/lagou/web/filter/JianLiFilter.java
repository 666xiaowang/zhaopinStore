package com.lagou.web.filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lagou.domain.Jianli;
import com.lagou.domain.User;
import com.lagou.service.impl.JianliServiceImpl;

/**
 * 访问简历相关页面时,判断Session中是否存在Jianli实体的对象
 * @author ronin
 *
 */
public class JianLiFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * 判断Session中是否存在Jianli实体的对象(non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		User user = (User) request.getSession().getAttribute("user");
		String userId = user.getUserId();
		/*
		 * 判断Session中是否存在Jianli实体的对象
		 */
		//如果有,不做任何操作,放行
		Jianli jianli = (Jianli) request.getSession().getAttribute("jianli");
		if(jianli != null) {
			chain.doFilter(req, resp);
		}else {
			//如果没有,在数据库中查询Jianli实体的对象
			Jianli findJianliByIdJianli = null;
			try {
				findJianliByIdJianli = new JianliServiceImpl().findJianliById(userId);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(findJianliByIdJianli != null) {
				//如果可以查询到,把查询到的结果放入Session中,放行
				request.getSession().setAttribute("jianli", findJianliByIdJianli);
				chain.doFilter(req, resp);
			}else {
				//如果查询不到,不做任何操作,放行
				chain.doFilter(req, resp);
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
		
	}
}

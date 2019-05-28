package com.lagou.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lagou.domain.User;

/**
 * 只有登陆了的用户才能访问简历相关页面,此过滤器用于实现这个功能
 * @author ronin
 *
 */
public class LoginFilter implements Filter{

	private static final String HttpServletRequest = null;


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		/*
		 * 判断Session有无user对象,如果Session中有user对象,就说明登陆了,执行放行
		 * 如果Session中没有user对象,则说明,没有登陆,则重定向到登陆页面
		 */
		User loginUser = (User) request.getSession().getAttribute("user");
		if(loginUser == null) {
			//没有登陆,重定向到登陆页面
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}else {
			//已经登陆了,可以访问指定目录下的文件
			chain.doFilter(req, resp);
			return;
		}
	}

	
	@Override
	public void destroy() {
		
	}

}

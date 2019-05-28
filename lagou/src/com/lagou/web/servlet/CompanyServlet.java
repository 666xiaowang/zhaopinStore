package com.lagou.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lagou.dao.impl.CompanyDaoImpl;
import com.lagou.domain.Company;
import com.ronin.servlet.BaseServlet;

public class CompanyServlet extends BaseServlet{

	/*
	 * 公司列表
	 */
	public String companylist(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		/*
		 * 从数据库中查询公司 
		 */ 
		try {
			List<Company> companyList = new CompanyDaoImpl().findAll();
			request.getSession().setAttribute("companyList", companyList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

package com.lagou.web.servlet;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.lagou.domain.User;
import com.lagou.service.impl.JianliServiceImpl;
import com.lagou.service.impl.UserServiceImpl;
import com.ronin.commoms.CommonUtils;
import com.ronin.servlet.BaseServlet;


public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
   
	/*
	 * 注册功能
	 */
	public String regist(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
			user.setUserId(CommonUtils.uuid());
			new UserServiceImpl().regist(user);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql异常....");
		}
		System.out.println("servlet:"+user);
		return "r:/login.jsp";//表示转发到index.jsp
	}
	
	
	/*
	 * 登陆功能
	 */
	public String login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
			User loginUser = new UserServiceImpl().login(user);
			/*
			 * 把从数据库中查询到的user放入到session域中
			 */
			request.getSession().setAttribute("user", loginUser);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "f:/index.jsp";//表示转发到index.jsp
	}
	
	
	/*
	 * 根据id查询信息,工具方法
	 */
	public String findUserById(String id)throws ServletException, IOException {
		try {
			User findUserByIdUser = new UserServiceImpl().findUserById(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("根据id查询失败");
		}	
		return null;
	}
	
}

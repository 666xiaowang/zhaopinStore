package com.lagou.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.lagou.domain.Position;
import com.lagou.domain.User;
import com.lagou.service.impl.PositionServiceImpl;
import com.lagou.service.impl.UserServiceImpl;
import com.ronin.commoms.CommonUtils;
import com.ronin.servlet.BaseServlet;

public class PositionServlet extends BaseServlet{
	
	/*
	 * 新增职位
	 */
	public String addJob(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		/*
		 * 新增职位 
		 */ 
		Position postion = new Position();
		try {
			BeanUtils.populate(postion, request.getParameterMap());
			postion.setPostionId(CommonUtils.uuid());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} 
		
		
		try {
			List<Position> positionList = new PositionServiceImpl().addPosition(postion);
			request.getSession().setAttribute("positionList", positionList);
			return "r:/jianli/createsuccess.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

package com.lagou.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.lagou.domain.Jianli;
import com.lagou.domain.User;
import com.lagou.service.impl.JianliServiceImpl;
import com.ronin.servlet.BaseServlet;

/**
 * 简历相关
 * @author ronin
 *
 */
public class JianLiServlet extends BaseServlet{

	/*
	 * 保存用户修改后的简历信息
	 */
	public String editBasic(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		try {
			User findUserByIdUser = new JianliServiceImpl().editBasic(user);
			request.getSession().setAttribute("user", findUserByIdUser);
			//注意:转发会导致样式丢失,当域的范围大于session时,重定向可以携带数据
			return "r:/jianli/jianli.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("更新基础信息失败...");
		}
		
		return null;
	}
	
	
	/*
	 * 修改简历中的期望工作部分信息
	 */
	public String expectEdit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Jianli jianli = new Jianli();
		try {
			BeanUtils.populate(jianli, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		try {
			Jianli findJianliByIdJianli = new JianliServiceImpl().expectEdit(jianli);
			request.getSession().setAttribute("jianli", findJianliByIdJianli);
			return "r:/jianli/jianli.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("修改期望工作失败...");
		}
		return null;
	}
	
	
	/*
	 * 修改简历中的工作经历信息
	 */
	public String workExperience(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Jianli jianli = new Jianli();
		try {
			BeanUtils.populate(jianli, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println(jianli);
		try {
			Jianli findJianliByIdJianli = new JianliServiceImpl().workExperience(jianli);
			request.getSession().setAttribute("jianli", findJianliByIdJianli);
			return "r:/jianli/jianli.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("修改工作经历失败...");
		}
		return null;
	}
	
	
	
	
	/*
	 * 修改简历中的项目经历信息
	 */
	public String projectExperience(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Jianli jianli = new Jianli();
		try {
			BeanUtils.populate(jianli, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		try {
			Jianli findJianliByIdJianli = new JianliServiceImpl().projectExperience(jianli);
			request.getSession().setAttribute("jianli", findJianliByIdJianli);
			return "r:/jianli/jianli.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("修改工作经历失败...");
		}
		return null;
	}
	
	
	/*
	 * 修改简历中的教育背景
	 */
	public String educationalShow(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Jianli jianli = new Jianli();
		try {
			BeanUtils.populate(jianli, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(jianli);
		try {
			Jianli findJianliByIdJianli = new JianliServiceImpl().educationalShow(jianli);
			request.getSession().setAttribute("jianli", findJianliByIdJianli);
			return "r:/jianli/jianli.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("修改教育背景失败...");
		}
		return null;
	}
	
	
	
	/*
	 * 修改简历中的自我部分描述
	 */
	public String descriptionEdit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Jianli jianli = new Jianli();
		try {
			BeanUtils.populate(jianli, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		try {
			Jianli findJianliByIdJianli = new JianliServiceImpl().descriptionEdit(jianli);
			request.getSession().setAttribute("jianli", findJianliByIdJianli);
			return "r:/jianli/jianli.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("修改自我描述失败...");
		}
		return null;
	}
	
	
	/*
	 * 修改简历中的工作描述部分
	 */
	public String workShow(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Jianli jianli = new Jianli();
		try {
			BeanUtils.populate(jianli, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(jianli);
		try {
			Jianli findJianliByIdJianli = new JianliServiceImpl().workShow(jianli);
			request.getSession().setAttribute("jianli", findJianliByIdJianli);
			return "r:/jianli/jianli.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("修改工作描述失败...");
		}
		return null;
	}
	
	/*
	 * 根据id重命名
	 */
	public String renameById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String myname = request.getParameter("myname");
		String userId = request.getParameter("userId");
		User renameByIdUser = null;
		try {
			renameByIdUser = new JianliServiceImpl().renameById(myname,userId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getSession().setAttribute("user", renameByIdUser);
		response.getWriter().print(renameByIdUser.getName());
		return null;
	}
}

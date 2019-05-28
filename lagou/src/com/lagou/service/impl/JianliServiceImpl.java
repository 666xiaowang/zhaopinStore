package com.lagou.service.impl;

import java.sql.SQLException;

import com.lagou.dao.impl.JianliDaoImpl;
import com.lagou.dao.impl.UserDaoImpl;
import com.lagou.domain.Jianli;
import com.lagou.domain.User;
import com.lagou.service.IJianliService;

public class JianliServiceImpl implements IJianliService{

	/*
	 * 修改简历中的基础信息
	 */
	@Override
	public User editBasic(User user) throws SQLException {
		return new JianliDaoImpl().editBasic(user);
	}
	
	/*
	 * 修改简历中的期望工作部分信息
	 */
	@Override
	public Jianli expectEdit(Jianli jianli) throws SQLException {
		return new JianliDaoImpl().expectEdit(jianli);
	}

	/*
	 * 根据id在简历表中查询对应的记录
	 * @return
	 */
	@Override
	public Jianli findJianliById(String id) throws SQLException {
		
		return new JianliDaoImpl().findJianliById(id);
	}

	/*
	 * 修改简历中的工作经历部分信息
	 * @return
	 */
	@Override
	public Jianli workExperience(Jianli jianli) throws SQLException {
		System.out.println(jianli);
		return new JianliDaoImpl().workExperience(jianli);
	}
	
	
	/*
	 * 修改简历中的项目经历部分
	 * @return
	 */
	@Override
	public Jianli projectExperience(Jianli jianli) throws SQLException {
		// TODO Auto-generated method stub
		return new JianliDaoImpl().projectExperience(jianli);
	}

	/*
	 * 修改简历中的教育背景
	 */
	@Override
	public Jianli educationalShow(Jianli jianli) throws SQLException {
		// TODO Auto-generated method stub
		return new JianliDaoImpl().educationalShow(jianli);
	}

	/*
	 * 修改简历中的自我描述部分
	 */
	@Override
	public Jianli descriptionEdit(Jianli jianli) throws SQLException {
		// TODO Auto-generated method stub
		return new JianliDaoImpl().descriptionEdit(jianli);
	}

	/*
	 * 修改简历中的工作描述部分
	 */
	@Override
	public Jianli workShow(Jianli jianli) throws SQLException {
		// TODO Auto-generated method stub
		return new JianliDaoImpl().workShow(jianli);
	}
	
	/*
	 * 根据id重命名
	 */
	@Override
	public User renameById(String myname, String userId) throws SQLException {
		return new JianliDaoImpl().findUserById(userId,myname);
	}
}

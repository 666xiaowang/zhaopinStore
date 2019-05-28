package com.lagou.service.impl;

import java.sql.SQLException;

import com.lagou.dao.impl.UserDaoImpl;
import com.lagou.domain.User;
import com.lagou.service.IUserService;

public class UserServiceImpl implements IUserService{

	/*
	 * 注册
	 */
	@Override
	public boolean regist(User user) throws SQLException {
		return new UserDaoImpl().regist(user);
	}

	/*
	 * 登录
	 */
	@Override
	public User login(User user) throws SQLException {
		return new UserDaoImpl().login(user);
	}

	/*
	 * 根据id查询信息
	 */
	@Override
	public User findUserById(String id) throws SQLException {
		return new UserDaoImpl().findUserById(id);
	}

	

}

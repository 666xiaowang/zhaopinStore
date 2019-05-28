package com.lagou.service;

import java.sql.SQLException;

import com.lagou.domain.User;

public interface IUserService {
	//注册功能
	public abstract boolean regist(User user) throws SQLException;
	//登录功能
	public abstract User login(User user) throws SQLException;
	//根据Id查询用户
	public abstract User findUserById(String id) throws SQLException;
	
}

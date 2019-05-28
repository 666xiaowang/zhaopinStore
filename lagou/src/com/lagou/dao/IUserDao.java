package com.lagou.dao;

import java.sql.SQLException;

import com.lagou.domain.User;

public interface IUserDao {
	public abstract boolean regist(User user) throws SQLException;
	public abstract User login(User user) throws SQLException;
	public abstract User findUserById(String id) throws SQLException;
	String findUserById(String userId, String myname);
}

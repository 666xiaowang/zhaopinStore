package com.lagou.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.BeanHandler;

import com.lagou.dao.IUserDao;
import com.lagou.domain.User;
import com.ronin.jdbc.TxQueryRunner;

public class UserDaoImpl implements IUserDao{

	/*
	 * 注册功能
	 */
	public boolean regist(User user) throws SQLException {
		System.out.println("dao:"+user);
		boolean flag = false;
		TxQueryRunner tx = new TxQueryRunner();
		String registSql = "insert into l_user values(?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {user.getUserId(),user.getName(),user.getEmail(),user.getPassword(),user.getGender(),
						   user.getTopDegree(),user.getPhoneno(),user.getWorkyear(),user.getCurrentState(),user.getType()};
		int update = tx.update(registSql, params);
		if(update > 0){
			flag = true;
		}
		return false;
	}

	/*
	 * 登陆功能
	 */
	@Override
	public User login(User user) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		String loginSql = "select * from l_user where email = ? and password = ?";
		Object[] params = {user.getEmail(),user.getPassword()};
		return tx.query(loginSql, new BeanHandler<>(User.class),params);
	}

	/*
	 * 根据id查询用户是否存在
	 */
	@Override
	public User findUserById(String id) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		String findUserByIdSql = "select * from l_user where id = ?";
		Object[] params = {id};
		return tx.query(findUserByIdSql, new BeanHandler<>(User.class),params);
	}

	/*
	 * 根据Id重命名
	 * @see com.lagou.dao.IUserDao#findUserById(java.lang.String, java.lang.String)
	 */
	@Override
	public String findUserById(String userId, String myname) {
		// TODO Auto-generated method stub
		return null;
	}


}

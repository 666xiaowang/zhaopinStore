package com.lagou.dao;

import java.sql.SQLException;

import com.lagou.domain.Jianli;
import com.lagou.domain.User;

public interface IJianliDao {
	public abstract User editBasic(User user) throws SQLException;
	public abstract Jianli expectEdit(Jianli jianli) throws SQLException;
	public abstract Jianli findJianliById(String id) throws SQLException ;
	public abstract Jianli workExperience(Jianli jianli) throws SQLException ;
	public abstract Jianli projectExperience(Jianli jianli) throws SQLException;
	public abstract Jianli educationalShow(Jianli jianli) throws SQLException;
	public abstract Jianli descriptionEdit(Jianli jianli) throws SQLException;
	public abstract Jianli workShow(Jianli jianli) throws SQLException;
	public abstract User findUserById(String userId, String myname) throws SQLException;
}

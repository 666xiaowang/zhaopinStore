package com.lagou.service;

import java.sql.SQLException;

import com.lagou.domain.Jianli;
import com.lagou.domain.User;

public interface IJianliService {
	//编辑简历中的基础信息
	public abstract User editBasic(User user) throws SQLException;
	//编辑简历中的期望工作信息
	public abstract Jianli expectEdit(Jianli jianli) throws SQLException;
	public abstract Jianli findJianliById(String id) throws SQLException ;
	//修改简历中的工作经历部分信息
	public abstract Jianli workExperience(Jianli jianli) throws SQLException ;
	public abstract Jianli projectExperience(Jianli jianli) throws SQLException;
	public abstract Jianli educationalShow(Jianli jianli) throws SQLException;
	public abstract Jianli descriptionEdit(Jianli jianli) throws SQLException;
	public abstract Jianli workShow(Jianli jianli) throws SQLException;
	//重命名
	public abstract User renameById(String myname, String userId) throws SQLException;
}

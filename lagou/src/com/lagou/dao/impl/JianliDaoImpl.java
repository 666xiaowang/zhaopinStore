package com.lagou.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.lagou.dao.IJianliDao;
import com.lagou.domain.Jianli;
import com.lagou.domain.User;
import com.ronin.jdbc.TxQueryRunner;

public class JianliDaoImpl implements IJianliDao{

	/*
	 * 修改基础信息
	 * @see com.lagou.dao.IJianliDao#editBasic(com.lagou.domain.User)
	 */
	@Override
	public User editBasic(User user) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		//更新基础信息
		String editBasicSql = "update l_user set name = ?,email = ?,gender = ?, topDegree = ?,workyear = ?,phoneno = ?,currentState = ? where userId = ?";
		Object[] params = {user.getName(),user.getEmail(),user.getGender(),user.getTopDegree(),
						   user.getWorkyear(),user.getPhoneno(),user.getCurrentState(),user.getUserId()};
		tx.update(editBasicSql, params);
		//根据id查询修改后的User
		String findUserSql = "select * from l_user where userId = ?";
		Object[] params1 = {user.getUserId()};
		User findUserByIdUser = tx.query(findUserSql, new BeanHandler<>(User.class),params1);
		return findUserByIdUser;
	}

	
	/*
	 * 修改简历中的期望工作部分信息
	 */
	@Override
	public Jianli expectEdit(Jianli jianli) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		//根据id查询当前id在简历表中是否有对应的记录,如果有进行更新操作,如果没有,进行增加操作
		//1.根据id查询当前id在简历表中有几条对应的记录
		String findJianliByIdSql = "select count(1) from l_jianli where userId = ?";
		Object[] param = {jianli.getUserId()};
		Number countTemp = (Number) tx.query(findJianliByIdSql, new ScalarHandler(),param);
		int count = countTemp.intValue();
		if(count > 0) {
			//说明数据库中已经存在该条记录,则执行更新操作
			String expectEditSql = "update l_jianli set expectCity = ?,type = ?,expectPosition = ?,expectSalary = ? where userId = ?";
			Object[] params = {jianli.getExpectCity(),jianli.getType(),jianli.getExpectPosition(),jianli.getExpectSalary(),jianli.getUserId()};
			tx.update(expectEditSql, params);
		}else {
			//count的值为0,则说明数据库中不存在该记录,则执行新增操作
			String expectEditSql = "insert into l_jianli(userId,expectCity,type,expectPosition,expectSalary) values(?,?,?,?,?)";
			Object[] params = {jianli.getUserId(),jianli.getExpectCity(),jianli.getType(),jianli.getExpectPosition(),jianli.getExpectSalary()};
			tx.update(expectEditSql, params);
		}
		
		//查询修改后的简历信息
		String findUserSql = "select * from l_jianli where userId = ?";
		Object[] params1 = {jianli.getUserId()};
		Jianli findJianliByIdJianli = tx.query(findUserSql, new BeanHandler<>(Jianli.class),params1);
		return findJianliByIdJianli;
	}


	/*
	 * 从数据库中查询判断此id对应的简历记录,先根据id查询记录的条数
	 */
	@Override
	public Jianli findJianliById(String id) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		String findJianliByIdSql = "select count(1) from l_jianli where userId = ?";
		Object[] param = {id};
		Number countTemp = (Number) tx.query(findJianliByIdSql, new ScalarHandler(),param);
		int count = countTemp.intValue();
		if(count == 1) {
			//条数为1,把这条记录封装成一个实体,放入Session中
			String findJianliSql = "select * from l_jianli where userId = ?";
			Object[] params = {id};
			Jianli findJianliByIdJianli = tx.query(findJianliSql, new BeanHandler<>(Jianli.class),params);
			return findJianliByIdJianli;
		}else {
			//条数为0,说明没有此记录,用户还未进行相关操作
			return null;
		}
	}

	
	/*
	 * 修改简历中的工作经历部分信息
	 * @return
	 */
	@Override
	public Jianli workExperience(Jianli jianli) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		String findJianliByIdSql = "select count(1) from l_jianli where userId = ?";
		Object[] param = {jianli.getUserId()};
		Number countTemp = (Number) tx.query(findJianliByIdSql, new ScalarHandler(),param);
		int count = countTemp.intValue();
		
		//companyName positionName 	companyYearStart	companyYearEnd	companyMonthStart companyMonthEnd
		if(count > 0) {
			//说明数据库中已经存在该条记录,则执行更新操作
			String workExperienceSql = "update l_jianli set companyName = ?,positionName = ?,companyYearStart = ?,companyYearEnd = ?,companyMonthStart = ?,companyMonthEnd = ? where userId = ?";
			Object[] params = {jianli.getCompanyName(),jianli.getPositionName(),jianli.getCompanyYearStart(),jianli.getCompanyYearEnd(),jianli.getCompanyMonthStart(),jianli.getCompanyMonthEnd(),jianli.getUserId()};
			tx.update(workExperienceSql, params);
		}else {
			//count的值为0,则说明数据库中不存在该记录,则执行新增操作
			String workExperienceSql = "insert into l_jianli(userId,companyName,positionName,companyYearStart,companyYearEnd,companyMonthStart,companyMonthEnd) values(?,?,?,?,?,?,?)";
			Object[] params = {jianli.getUserId(),jianli.getCompanyName(),jianli.getPositionName(),jianli.getCompanyYearStart(),jianli.getCompanyMonthEnd(),jianli.getCompanyMonthStart(),jianli.getCompanyMonthEnd()};
			tx.update(workExperienceSql, params);
		}
		
		//查询修改后的简历信息
		String findUserSql = "select * from l_jianli where userId = ?";
		Object[] params1 = {jianli.getUserId()};
		Jianli findJianliByIdJianli = tx.query(findUserSql, new BeanHandler<>(Jianli.class),params1);
		return findJianliByIdJianli;
		
	}


	/*
	 * 修改简历中的项目经历信息
	 */
	@Override
	public Jianli projectExperience(Jianli jianli) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		String findJianliByIdSql = "select count(1) from l_jianli where userId = ?";
		Object[] param = {jianli.getUserId()};
		Number countTemp = (Number) tx.query(findJianliByIdSql, new ScalarHandler(),param);
		int count = countTemp.intValue();
		
						//projectName	thePost projectYearStart projectYearEnd projectMonthStart projectMonthEnd projectDescription
		if(count > 0) {
			//说明数据库中已经存在该条记录,则执行更新操作
			String workExperienceSql = "update l_jianli set projectName = ?,thePost = ?,projectYearStart = ?,projectYearEnd = ?,projectMonthStart = ?,projectMonthEnd = ? ,projectDescription = ? where userId = ?";
			Object[] params = {jianli.getProjectName(),jianli.getThePost(),jianli.getProjectYearStart(),jianli.getProjectYearEnd(),jianli.getProjectMonthStart(),jianli.getProjectMonthEnd(),jianli.getProjectDescription(),jianli.getUserId()};
			tx.update(workExperienceSql, params);
		}else {
			//count的值为0,则说明数据库中不存在该记录,则执行新增操作
			String workExperienceSql = "insert into l_jianli(userId,projectName,thePost,projectYearStart,projectYearEnd,projectMonthStart,projectMonthEnd,projectDescription) values(?,?,?,?,?,?,?,?)";
			Object[] params = {jianli.getUserId(),jianli.getProjectName(),jianli.getThePost(),jianli.getProjectYearStart(),jianli.getProjectYearEnd(),jianli.getProjectMonthStart(),jianli.getProjectMonthEnd(),jianli.getProjectDescription()};
			tx.update(workExperienceSql, params);
		}
		
		//查询修改后的简历信息
		String findJianliSql = "select * from l_jianli where userId = ?";
		Object[] params1 = {jianli.getUserId()};
		Jianli findJianliByIdJianli = tx.query(findJianliSql, new BeanHandler<>(Jianli.class),params1);
		return findJianliByIdJianli;
	}


	/*
	 * 修改简历中的教育背景
	 */
	@Override
	public Jianli educationalShow(Jianli jianli) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		String findJianliByIdSql = "select count(1) from l_jianli where userId = ?";
		Object[] param = {jianli.getUserId()};
		Number countTemp = (Number) tx.query(findJianliByIdSql, new ScalarHandler(),param);
		int count = countTemp.intValue();
		
		//schoolName,degree,professionalName,schoolYearStart,schoolYearEnd
		if(count > 0) {
			//说明数据库中已经存在该条记录,则执行更新操作
			String workExperienceSql = "update l_jianli set schoolName = ?,degree = ?,professionalName = ?,schoolYearStart = ?,schoolYearEnd = ? where userId = ?";
			Object[] params = {jianli.getSchoolName(),jianli.getDegree(),jianli.getProfessionalName(),jianli.getSchoolYearStart(),jianli.getSchoolYearEnd(),jianli.getUserId()};
			tx.update(workExperienceSql, params);
		}else {
			//count的值为0,则说明数据库中不存在该记录,则执行新增操作
			String workExperienceSql = "insert into l_jianli(userId,schoolName,degree,professionalName,schoolYearStart,schoolYearEnd) values(?,?,?,?,?,?)";
			Object[] params = {jianli.getUserId(),jianli.getSchoolName(),jianli.getDegree(),jianli.getProfessionalName(),jianli.getSchoolYearStart(),jianli.getSchoolYearEnd()};
			tx.update(workExperienceSql, params);
		}
		
		//查询修改后的简历信息
		String findJianliSql = "select * from l_jianli where userId = ?";
		Object[] params1 = {jianli.getUserId()};
		Jianli findJianliByIdJianli = tx.query(findJianliSql, new BeanHandler<>(Jianli.class),params1);
		return findJianliByIdJianli;
	}


	/*
	 * 修改简历中的自我描述部分
	 */
	@Override
	public Jianli descriptionEdit(Jianli jianli) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		String findJianliByIdSql = "select count(1) from l_jianli where userId = ?";
		Object[] param = {jianli.getUserId()};
		Number countTemp = (Number) tx.query(findJianliByIdSql, new ScalarHandler(),param);
		int count = countTemp.intValue();
		
		if(count > 0) {
			//说明数据库中已经存在该条记录,则执行更新操作
			String descriptionEditSql = "update l_jianli set selfDescription = ? where userId = ?";
			Object[] params = {jianli.getSelfDescription(),jianli.getUserId()};
			tx.update(descriptionEditSql, params);
		}else {
			//count的值为0,则说明数据库中不存在该记录,则执行新增操作
			String descriptionEditSql = "insert into l_jianli(userId,selfDescription) values(?,?)";
			Object[] params = {jianli.getUserId(),jianli.getSelfDescription()};
			tx.update(descriptionEditSql, params);
		}
		
		//查询修改后的简历信息
		String findJianliSql = "select * from l_jianli where userId = ?";
		Object[] params1 = {jianli.getUserId()};
		Jianli findJianliByIdJianli = tx.query(findJianliSql, new BeanHandler<>(Jianli.class),params1);
		return findJianliByIdJianli;
	}


	/*
	 * 修改简历中的工作描述部分
	 */
	@Override
	public Jianli workShow(Jianli jianli) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		String findJianliByIdSql = "select count(1) from l_jianli where userId = ?";
		Object[] param = {jianli.getUserId()};
		Number countTemp = (Number) tx.query(findJianliByIdSql, new ScalarHandler(),param);
		int count = countTemp.intValue();
		if(count > 0) {
			//说明数据库中已经存在该条记录,则执行更新操作
			String workShowSql = "update l_jianli set workLink = ? ,workDescription = ? where userId = ?";
			Object[] params = {jianli.getWorkLink(),jianli.getWorkDescription(),jianli.getUserId()};
			tx.update(workShowSql, params);
		}else {
			//count的值为0,则说明数据库中不存在该记录,则执行新增操作
			String workShowSql = "insert into l_jianli(userId,workLink,workDescription) values(?,?,?)";
			Object[] params = {jianli.getUserId(),jianli.getWorkLink(),jianli.getWorkDescription()};
			tx.update(workShowSql, params);
		}
		
		//查询修改后的简历信息
		String findJianliSql = "select * from l_jianli where userId = ?";
		Object[] params1 = {jianli.getUserId()};
		Jianli findJianliByIdJianli = tx.query(findJianliSql, new BeanHandler<>(Jianli.class),params1);
		return findJianliByIdJianli;
	}

	
	/*
	 * 重命名
	 */
	@Override
	public User findUserById(String userId, String myname) throws SQLException  {
		TxQueryRunner tx = new TxQueryRunner();
		String renameSql = "update l_user set name = ? where userId = ?";
		Object[] params = {myname,userId};
		tx.update(renameSql,params);
		
		String findUserByIdUserSql= "select * from l_user where userId = ?";
		Object[] params1 = {userId};
		User findUserByIdUser = tx.query(findUserByIdUserSql, new BeanHandler<>(User.class),params1);
		return findUserByIdUser;
	}
}

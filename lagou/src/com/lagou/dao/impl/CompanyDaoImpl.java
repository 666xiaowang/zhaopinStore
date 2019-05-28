package com.lagou.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.lagou.dao.ICompanyDao;
import com.lagou.domain.Company;
import com.lagou.domain.User;
import com.ronin.jdbc.JdbcUtils;
import com.ronin.jdbc.TxQueryRunner;

public class CompanyDaoImpl implements ICompanyDao{

	/*
	 * 查询所有公司信息并返回
	 * @see com.lagou.dao.ICompanyDao#findAll()
	 */
	@Override
	public List<Company> findAll() throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		//更新基础信息
		String findAllSql = "select * from l_company_job";
		List<Company> companyList = tx.query(findAllSql, new BeanListHandler<>(Company.class));
		return companyList;
	}
	
	@Test
	public void fun1() throws SQLException{
		TxQueryRunner tx = new TxQueryRunner();
		//更新基础信息
		String findAllSql = "select * from l_company_job";
		List<Company> companyList = tx.query(findAllSql, new BeanListHandler<>(Company.class));
		System.out.println(companyList);
		System.out.println(companyList);
	}

}

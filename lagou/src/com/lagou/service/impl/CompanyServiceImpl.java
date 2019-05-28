package com.lagou.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.lagou.dao.impl.CompanyDaoImpl;
import com.lagou.domain.Company;
import com.lagou.service.ICompanyService;

public class CompanyServiceImpl implements ICompanyService{

	@Override
	public List<Company> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return new CompanyDaoImpl().findAll();
	}

}

package com.lagou.dao;

import java.sql.SQLException;
import java.util.List;

import com.lagou.domain.Company;

public interface ICompanyDao {
	public abstract List<Company> findAll() throws SQLException;
}

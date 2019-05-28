package com.lagou.service;

import java.sql.SQLException;
import java.util.List;

import com.lagou.domain.Company;

public interface ICompanyService {
	public abstract List<Company> findAll() throws SQLException;
}

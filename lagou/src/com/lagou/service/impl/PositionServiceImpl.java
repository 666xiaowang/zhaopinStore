package com.lagou.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.lagou.dao.impl.PositionDaoImpl;
import com.lagou.domain.Position;
import com.lagou.service.IPositionService;

public class PositionServiceImpl implements IPositionService{

	@Override
	public List<Position> addPosition(Position postion) throws SQLException {
		return new PositionDaoImpl().addPosition(postion);
	}

}

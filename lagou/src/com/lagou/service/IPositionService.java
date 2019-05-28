package com.lagou.service;

import java.sql.SQLException;
import java.util.List;

import com.lagou.domain.Position;

public interface IPositionService {

	public abstract List<Position> addPosition(Position postion) throws SQLException;

}

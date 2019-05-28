package com.lagou.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.lagou.dao.IPositionDao;
import com.lagou.domain.Position;
import com.ronin.jdbc.TxQueryRunner;

public class PositionDaoImpl implements IPositionDao{
	public List<Position> addPosition(Position postion) throws SQLException {
		TxQueryRunner tx = new TxQueryRunner();
		//更新基础信息
		String addPostionSql = "insert into l_position values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {postion.getPostionId(),postion.getPositionType(),postion.getPositionName(),postion.getDepartment(),postion.getJobNature(),
				postion.getSalaryMin(),postion.getSalaryMax(),postion.getWorkAddress(),postion.getExperience(),postion.getEducation(),
				postion.getPositionAdvantage(),postion.getPositionDetail(),postion.getPositionAddress(),postion.getForwardEmail(),postion.getUserId()};
		tx.update(addPostionSql, params);
		//根据id查询修改后的Position
		String findPositionSql = "select * from l_position where userId = ?";
		Object[] params1 = {postion.getUserId()};
		List<Position> list = tx.query(findPositionSql,new BeanListHandler<>(Position.class),params1);
		return list;
	}

}

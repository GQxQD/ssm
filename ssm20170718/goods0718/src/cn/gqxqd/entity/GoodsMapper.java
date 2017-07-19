package cn.gqxqd.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GoodsMapper implements RowMapper<Goods> {

	@Override
	public Goods mapRow(ResultSet rs, int arg1) throws SQLException {
		Goods goods = new Goods();
		goods.setGid(rs.getInt("gid"));
		goods.setGtitle(rs.getString("gtitle"));
		goods.setDescription(rs.getString("description"));
		goods.setCategary(rs.getInt("categary"));
		goods.setPrice(rs.getDouble("price"));
		goods.setStock(rs.getInt("stock"));
		return goods;
	}

}

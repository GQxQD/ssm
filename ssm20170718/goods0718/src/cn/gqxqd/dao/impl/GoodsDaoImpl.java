package cn.gqxqd.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.gqxqd.dao.GoodsDao;
import cn.gqxqd.entity.Goods;
import cn.gqxqd.entity.GoodsMapper;

@Repository("goodsDao")
public class GoodsDaoImpl implements GoodsDao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addGoods(Goods goods) {
		String sql = "insert into goods(gtitle,categary,description,price,stock) values(?,?,?,?,?)";
		return jdbcTemplate.update(sql, new Object[] { goods.getGtitle(), goods.getCategary(), goods.getDescription(),
				goods.getPrice(), goods.getStock() });
	}

	@Override
	public int deleteGoodsById(int id) {
		String sql = "delete from goods where gid = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public int deleteGoods(Goods goods) {
		return deleteGoodsById(goods.getGid());
	}

	@Override
	public List<Goods> getGoodsList() {
		String sql = "select gtitle from goods";
		List<Map<String, Object>> listMap = jdbcTemplate.queryForList(sql);
		List<Goods> list = new ArrayList<>();
		for (Map<String, Object> map : listMap) {
			Goods goods = new Goods();
			goods.setGid((Integer) map.get("gid"));
			list.add(goods);
		}
		return list;
	}

	@Override
	public int updateGoods(Goods goods) {
		String sql = "update goods set gtitle=?,categary=?,description=?,price=?,stock=? where gid=?";
		return jdbcTemplate.update(sql, new Object[] { goods.getGtitle(), goods.getCategary(), goods.getDescription(),
				goods.getPrice(), goods.getStock(), goods.getGid() });
	}

	@Override
	public Goods findGoodsById(int id) {
		String sql = "select * from goods where gid=?";
		try {
			return jdbcTemplate.queryForObject(sql, new Object[] { id }, new GoodsMapper());
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Goods> findAll() {
		String sql = "select * from goods";
		List<Goods> list = jdbcTemplate.query(sql, new GoodsMapper());
		return list;
	}

	@Override
	public int getCount() {
		String sql = "select count(*) from goods";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

}

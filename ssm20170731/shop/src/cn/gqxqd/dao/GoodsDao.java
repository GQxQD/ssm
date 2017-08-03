package cn.gqxqd.dao;

import java.util.List;

import cn.gqxqd.entity.Goods;

public interface GoodsDao {

	public List<Goods> findAll();
	
	public Goods find(int id);

	public int save(Goods goods);

	public int delete(int id);

	public int update(Goods goods);

}

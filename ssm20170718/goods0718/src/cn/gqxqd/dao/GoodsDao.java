package cn.gqxqd.dao;

import java.util.List;

import cn.gqxqd.entity.Goods;

public interface GoodsDao {
	int addGoods(Goods goods);
	int deleteGoodsById(int id);
	int deleteGoods(Goods goods);
	int updateGoods(Goods goods);
	Goods findGoodsById(int id);
	List<Goods> getGoodsList();
	List<Goods> findAll();
	int getCount();
}

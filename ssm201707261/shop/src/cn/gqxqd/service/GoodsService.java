package cn.gqxqd.service;

import java.util.List;

import cn.gqxqd.entity.Goods;

public interface GoodsService {

	String getError();

	List<Goods> getGoodsList();
	List<Goods> getGoodsListByTitle(String key);

	boolean addGoods(Goods goods);

	boolean deleteGoods(int id);

	boolean updateGoods(Goods goods);
}

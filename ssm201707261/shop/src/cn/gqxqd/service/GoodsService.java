package cn.gqxqd.service;

import java.util.List;

import cn.gqxqd.entity.Goods;

public interface GoodsService {
	
	String getError();

	List<Goods> getGoodsList();

	boolean addGoods(Goods goods);
}

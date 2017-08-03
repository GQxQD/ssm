package cn.gqxqd.service;

import cn.gqxqd.entity.Goods;
import cn.gqxqd.util.ShopResult;

public interface GoodsService {

	public ShopResult getGoodsList();

	public ShopResult getGoodsById(int id);

	public ShopResult addGoods(Goods goods);

	public ShopResult deleteGoods(int id);

	public ShopResult updateGoods(Goods goods);
}

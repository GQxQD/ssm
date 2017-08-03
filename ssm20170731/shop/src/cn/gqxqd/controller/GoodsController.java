package cn.gqxqd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gqxqd.entity.Goods;
import cn.gqxqd.service.GoodsService;
import cn.gqxqd.util.ShopResult;

@Controller
@RequestMapping("goods")
public class GoodsController {

	@Resource
	private GoodsService goodsService;

	@RequestMapping("list")
	@ResponseBody
	public ShopResult getGoodsList() {
		return goodsService.getGoodsList();
	}

	@RequestMapping("find")
	@ResponseBody
	public ShopResult getGoodsById(int id) {
		return goodsService.getGoodsById(id);
	}

	@RequestMapping("add")
	@ResponseBody
	public ShopResult addGoods(Goods goods) {
		return goodsService.addGoods(goods);
	}

	@RequestMapping("delete")
	@ResponseBody
	public ShopResult deleteGoods(int id) {
		return goodsService.deleteGoods(id);
	}

	@RequestMapping("update")
	@ResponseBody
	public ShopResult updateGoods(Goods goods) {
		return goodsService.updateGoods(goods);
	}
}

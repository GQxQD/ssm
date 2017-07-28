package cn.gqxqd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gqxqd.entity.Goods;
import cn.gqxqd.service.GoodsService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	@ResponseBody
	@RequestMapping(value = "list", produces = "text/html; charset=utf-8")
	public String list(String key) {
		System.out.println(key);
		List<Goods> goodsList = new ArrayList<>();
		if (key != null && !"".equals(key.trim())) {
			goodsList = goodsService.getGoodsListByTitle(key);
		} else {
			goodsList = goodsService.getGoodsList();
		}
		System.out.println(goodsList.get(0));
		return JSONArray.fromObject(goodsList).toString();
	}

	@ResponseBody
	@RequestMapping(value = "add", produces = "text/html; charset=utf-8")
	public String add(Goods goods) {
		HashMap<String, Object> result = new HashMap<>();
		try {
			if (goodsService.addGoods(goods)) {
				result.put("flag", 0);
				result.put("msg", "商品添加成功！");
			} else {
				result.put("flag", 1);
				result.put("msg", goodsService.getError());
			}
		} catch (Exception e) {
			result.put("flag", 1);
			result.put("msg", e.getMessage());
		}
		return JSONObject.fromObject(result).toString();
	}

	@ResponseBody
	@RequestMapping(value = "update", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	public String update(Goods goods) {
		HashMap<String, Object> result = new HashMap<>();
		try {
			if (goodsService.updateGoods(goods)) {
				result.put("flag", 0);
				result.put("msg", "商品修改成功！");
			} else {
				result.put("flag", 1);
				result.put("msg", goodsService.getError());
			}
		} catch (Exception e) {
			result.put("flag", 1);
			result.put("msg", e.getMessage());
		}
		return JSONObject.fromObject(result).toString();
	}

	@ResponseBody
	@RequestMapping(value = "delete", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	public String delete(Integer id) {
		System.out.println("delete id is " + id);
		HashMap<String, Object> result = new HashMap<>();
		try {
			if (goodsService.deleteGoods(id)) {
				result.put("flag", 0);
				result.put("msg", "商品删除成功！");
			} else {
				result.put("flag", 1);
				result.put("msg", goodsService.getError());
			}
		} catch (Exception e) {
			result.put("flag", 1);
			result.put("msg", e.getMessage());
		}
		return JSONObject.fromObject(result).toString();
	}
}

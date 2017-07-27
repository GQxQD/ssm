package cn.gqxqd.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String list(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Goods> goodsList = goodsService.getGoodsList();
		System.out.println(goodsList.get(0));
		return JSONArray.fromObject(goodsList).toString();
	}

	@ResponseBody
	@RequestMapping(value = "add", produces = "text/html; charset=utf-8")
	public String add(String title){
//		HashMap<String, Object> result = new HashMap<>();
//		try {
//			String title = request.getParameter("title");
//			System.out.println("title:"+title);
//			String description = request.getParameter("description");
//			try {
//				int category = Integer.parseInt(request.getParameter("category"));
//				int stock = Integer.parseInt(request.getParameter("stock"));
//				double price = Double.valueOf(request.getParameter("price"));
//				Goods goods = new Goods(null, title, category, description, price, stock, null);
//				if (goodsService.addGoods(goods)) {
//					result.put("flag", 0);
//					result.put("msg", "商品添加成功！");
//				} else {
//					result.put("flag", 1);
//					result.put("msg", goodsService.getError());
//				}
//			} catch (Exception e) {
//				throw new Exception("商品分类、库存或价格格式不正确！");
//			}
//		} catch (Exception e) {
//			result.put("flag", 1);
//			result.put("msg", e.getMessage());
//		}
//		return JSONObject.fromObject(result).toString();
		return title;
	}
}

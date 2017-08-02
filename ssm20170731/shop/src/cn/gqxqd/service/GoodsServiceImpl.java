package cn.gqxqd.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gqxqd.dao.GoodsDao;
import cn.gqxqd.entity.Goods;
import cn.gqxqd.util.ShopResult;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsDao goodsDao;

	@Override
	public ShopResult getGoodsList() {
		ShopResult result = new ShopResult();
		List<Goods> list = goodsDao.findAll();
		if (list != null) {
			result.setStatus(0);
			result.setMsg("��ѯ�ɹ���");
			result.setData(list);
		} else {
			result.setStatus(1);
			result.setMsg("��ѯʧ�ܣ������ԣ�");
		}
		return result;
	}

}
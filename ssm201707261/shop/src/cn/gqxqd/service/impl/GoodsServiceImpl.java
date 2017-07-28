package cn.gqxqd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gqxqd.entity.Goods;
import cn.gqxqd.mapper.GoodsMapper;
import cn.gqxqd.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;
	private String error;

	public String getError() {
		return error;
	}

	@Override
	public List<Goods> getGoodsList() {
		return goodsMapper.getGoodsList();
	}

	@Override
	public boolean addGoods(Goods goods) {
		if (goods.getTitle() == null || "".equals(goods.getTitle().trim())) {
			this.error = "��Ʒ���Ʋ���Ϊ�գ�";
			return false;
		}
		if (goods.getPrice() == null || goods.getPrice() < 0) {
			this.error = "��Ʒ�۸���С��0��";
			return false;
		}
		if (goodsMapper.addGoods(goods) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteGoods(int id) {
		if (goodsMapper.deleteGoods(id) > 0) {
			return true;
		}
		this.error = "ɾ��δ�ܳɹ���û��Ӱ���κ����ݣ�";
		return false;
	}

	@Override
	public boolean updateGoods(Goods goods) {
		if (goodsMapper.updateGoods(goods) > 0) {
			return true;
		}
		this.error = "�޸�δ�ܳɹ���û��Ӱ���κ����ݣ�";
		return false;
	}

	@Override
	public List<Goods> getGoodsListByTitle(String key) {
		return goodsMapper.getGoodsListByTitle("%" + key + "%");
	}

}

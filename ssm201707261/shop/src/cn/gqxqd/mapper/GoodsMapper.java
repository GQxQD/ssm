package cn.gqxqd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.gqxqd.entity.Goods;

public interface GoodsMapper {

	@Select("select * from shop_goods")
	List<Goods> getGoodsList();
	@Select("select * from shop_goods where title like #{key}")
	List<Goods> getGoodsListByTitle(String key);
	
	@Insert("insert into shop_goods(title,category,description,price,stock,img) values(#{title},#{category},#{description},#{price},#{stock},#{img})")
	int addGoods(Goods goods);
	
	int updateGoods(Goods goods);
	
	@Delete("delete from shop_goods where id=#{id}")
	int deleteGoods(int id);
}

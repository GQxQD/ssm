package cn.gqxqd.service;

import cn.gqxqd.util.ShopResult;

public interface UserService {

	public ShopResult register(String username, String password);

	public ShopResult login(String username, String password);
	
	public ShopResult getUser(int id);
}

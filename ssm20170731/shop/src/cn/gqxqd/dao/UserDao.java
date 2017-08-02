package cn.gqxqd.dao;

import cn.gqxqd.entity.User;

public interface UserDao {

	public User get(int id);

	public User find(String username);

	public int save(User user);
}

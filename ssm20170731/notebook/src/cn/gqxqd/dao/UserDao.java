package cn.gqxqd.dao;

import cn.gqxqd.entity.User;

public interface UserDao {

	/**
	 * 通过用户名查找用户
	 * @param name 用户名
	 * @return 查找的用户
	 */
	public User findByName(String name);

	/**
	 * 保存一个新的用户
	 * @param user 用户
	 */
	public void save(User user);
}

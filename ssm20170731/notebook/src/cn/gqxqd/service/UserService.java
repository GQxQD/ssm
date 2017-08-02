package cn.gqxqd.service;

import cn.gqxqd.util.NoteResult;

public interface UserService {

	/**
	 * 检查登录
	 * @param name 登录用户名
	 * @param password 登录密码
	 * @return 登录结果
	 */
	public NoteResult checkLogin(String name, String password);

	/**
	 * 注册功能
	 * @param name 用户名
	 * @param password 用户密码
	 * @param nick 用户昵称
	 * @return 注册结果
	 */
	public NoteResult addUser(String name, String password, String nick);
}

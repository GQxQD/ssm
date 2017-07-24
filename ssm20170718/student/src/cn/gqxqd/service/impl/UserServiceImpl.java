package cn.gqxqd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gqxqd.entity.User;
import cn.gqxqd.mapper.UserMapper;
import cn.gqxqd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	private String error;

	public String getError() {
		return error;
	}

	@Override
	public boolean login(String username, String password) {
		if (username == null || password == null) {
			this.error = "用户名或密码不能为空！";
			return false;
		}
		username = username.trim();
		password = password.trim();
		if ("".equals(username) || "".equals(password)) {
			this.error = "用户名或密码不能为空！";
			return false;
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user = userMapper.findUser(user);
		if (user != null) {
			return true;
		}
		this.error = "用户名不存在或密码错误！";
		return false;
	}

}

package cn.gqxqd.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gqxqd.dao.UserDao;
import cn.gqxqd.entity.Session;
import cn.gqxqd.entity.User;
import cn.gqxqd.util.ShopResult;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Resource
	private SessionService sessionService;

	@Override
	public ShopResult register(String username, String password) {
		ShopResult result = new ShopResult();
		if (username == null || "".equals(username.trim())) {
			result.setStatus(1);
			result.setMsg("用户名不能为空！");
			return result;
		}
		if (password == null || "".equals(password.trim())) {
			result.setStatus(2);
			result.setMsg("密码不能为空！");
			return result;
		}
		username = username.trim();
		password = password.trim();
		if (username.length() < 3 || username.length() > 10) {
			result.setStatus(1);
			result.setMsg("用户名长度必须为3-10字符！");
			return result;
		}
		if (password.length() < 6 || password.length() > 20) {
			result.setStatus(2);
			result.setMsg("密码长度必须为6-20字符！");
			return result;
		}
		if (this.userDao.find(username) != null) {
			result.setStatus(1);
			result.setMsg("用户名已经存在！");
			return result;
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		int uid = this.userDao.save(user);
		if (uid > 0) {
			result.setStatus(0);
			result.setMsg("注册成功！用户id为：" + uid);
		} else {
			result.setStatus(3);
			result.setMsg("注册失败！");
		}
		return result;
	}

	@Override
	public ShopResult login(String username, String password) {
		ShopResult result = new ShopResult();
		if (username == null || "".equals(username.trim())) {
			result.setStatus(1);
			result.setMsg("用户名不能为空！");
			return result;
		}
		if (password == null || "".equals(password.trim())) {
			result.setStatus(2);
			result.setMsg("密码不能为空！");
			return result;
		}
		username = username.trim();
		password = password.trim();
		User user = this.userDao.find(username);
		if (user == null) {
			result.setStatus(1);
			result.setMsg("用户不存在！");
			return result;
		}
		if (!password.equals(user.getPassword())) {
			result.setStatus(2);
			result.setMsg("您输入的密码错误！");
			return result;
		}
		Session session = this.sessionService.getSession(user.getId());
		result.setStatus(0);
		result.setMsg("登录成功！");
		result.setData(session);
		return result;
	}

}

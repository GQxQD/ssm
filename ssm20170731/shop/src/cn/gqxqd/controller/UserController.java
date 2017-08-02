package cn.gqxqd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gqxqd.service.UserService;
import cn.gqxqd.util.ShopResult;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("register")
	@ResponseBody
	public ShopResult register(String username, String password) {
		return this.userService.register(username, password);
	}

	@RequestMapping("login")
	@ResponseBody
	public ShopResult login(String username, String password) {
		return this.userService.login(username, password);
	}
}

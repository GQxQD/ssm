package cn.gqxqd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gqxqd.service.UserService;
import cn.gqxqd.util.NoteResult;

@Controller
public class UserLoginController {

	@Resource(name = "userService")
	private UserService userService;

	/**
	 * 将处理好的数据返回给浏览器
	 * @param name
	 * @param password
	 * @return
	 */
	@RequestMapping("/user/login.do")
	@ResponseBody
	public NoteResult execute(String name, String password) {
		NoteResult noteResult = userService.checkLogin(name, password);
		return noteResult;
	}
}

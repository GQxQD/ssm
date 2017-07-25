package cn.gqxqd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class BaseController {

	protected String checkUserStatus(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null) {
			return this.error(request, "用户没有登录！", "login.html");
		}
		return null;
	}

	protected String error(HttpServletRequest request, String msg, String url, int timeout) {
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		request.setAttribute("timeout", timeout);
		return "common/error";
	}

	protected String error(HttpServletRequest request, String msg, String url) {
		return this.error(request, msg, url, 3);
	}

	protected String error(HttpServletRequest request, String msg) {
		return this.error(request, msg, null);
	}

	protected String success(HttpServletRequest request, String msg, String url, int timeout) {
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		request.setAttribute("timeout", timeout);
		return "common/success";
	}

	protected String success(HttpServletRequest request, String msg, String url) {
		return this.success(request, msg, url, 2);
	}
}

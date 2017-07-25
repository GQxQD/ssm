package cn.gqxqd.controller;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
	
	protected String error(HttpServletRequest request, String msg, String url, int timeout) {
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		request.setAttribute("timeout", timeout);
		return "common/error";
	}
}

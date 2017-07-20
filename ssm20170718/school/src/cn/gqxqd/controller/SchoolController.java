package cn.gqxqd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("school")
public class SchoolController {

	@RequestMapping("list")
	public ModelAndView gotopage(HttpServletRequest request) {
		String name = request.getParameter("name");
		String count = request.getParameter("c");
		int c = 0;
		if (count == null || "".equals(count)) {
			c = 1;
		} else {
			c = Integer.parseInt(count);
		}
		System.out.println(name);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", name);
		modelAndView.addObject("count", c);
		modelAndView.setViewName("schoolList");
		// request.setAttribute("name", "jack and rose");
		// request.setAttribute("user", "user");
		return modelAndView;
	}

	@RequestMapping("action")
	public ModelAndView action(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		String action = request.getParameter("action");
		if ("add".equals(action)) {
			System.out.println("add...");
		} else if ("delete".equals(action)) {
			System.out.println("delete...");
		} else if ("change".equals(action)) {
			System.out.println("change...");
		}
		modelAndView.setViewName("action");
		return modelAndView;
	}
}

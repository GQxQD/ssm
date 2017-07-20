package cn.gqxqd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.gqxqd.entity.School;
import cn.gqxqd.service.SchoolService;

@Controller("schoolController")
@RequestMapping("school")
public class SchoolController {

	@Autowired
	private SchoolService schoolService;

	public void setSchoolService(SchoolService schoolService) {
		this.schoolService = schoolService;
	}

	@RequestMapping("list")
	public ModelAndView gotopage(HttpServletRequest request, Model model) {
		List<School> list = schoolService.findSchoolList();
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
		modelAndView.addObject("list",list);
		modelAndView.setViewName("school-list");
		// request.setAttribute("name", "jack and rose");
		// request.setAttribute("user", "user");
		return modelAndView;
	}

	// ModelMap是Model接口的实现类，同样可以通过ModelMap向页面传输数据
	@RequestMapping("action")
	public ModelAndView action(HttpServletRequest request, ModelMap modelMap) {
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
		modelMap.addAttribute("name", "kohai");
		return modelAndView;
	}
}

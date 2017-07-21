package cn.gqxqd.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.gqxqd.entity.School;
import cn.gqxqd.service.SchoolService;
import cn.gqxqd.util.JsonMsg;
import net.sf.json.JSONObject;

@Controller("schoolController")
@RequestMapping("school")
public class SchoolController {

	@Autowired
	private SchoolService schoolService;

	public void setSchoolService(SchoolService schoolService) {
		this.schoolService = schoolService;
	}

	@RequestMapping("school-list")
	public ModelAndView gotopage(HttpServletRequest request, Model model) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf8");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("school-list");
		String schoolName = request.getParameter("school_name");
		if (schoolName != null && !"".equals(schoolName.trim())) {
			modelAndView.addObject("search_key", schoolName);
			List<School> list = schoolService.findSchoolsByName(schoolName);
			modelAndView.addObject("list", list);
		} else {
			List<School> list = schoolService.findSchoolList();
			modelAndView.addObject("list", list);
		}
		return modelAndView;
	}

	@RequestMapping("school-add")
	public ModelAndView addSchoolPage(HttpServletRequest request, Model model) throws ParseException {
		String method = request.getMethod();
		method = method.toLowerCase();
		if ("post".equals(method)) {
			ModelAndView modelAndView = new ModelAndView();
			String name = request.getParameter("name");
			String president = request.getParameter("president");
			String address = request.getParameter("address");
			String tel = request.getParameter("tel");
			String email = request.getParameter("email");
			String schoolDateStr = request.getParameter("schoolDate");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date schoolDate = simpleDateFormat.parse(schoolDateStr);
			System.out.println(schoolDateStr);
			School school = new School(null, name, president, address, tel, email, true, schoolDate);
			System.out.println(school.toString());
			if (schoolService.addSchool(school)) {
				System.out.println("add success...");
				this.success(modelAndView, "添加成功！");
			} else {
				System.out.println("error...");
				this.success(modelAndView, "添加失败！");
			}
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("school-add");
			return modelAndView;
		}
	}

	@RequestMapping("delete")
	public void json(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json;charset=utf8");
		String method = request.getMethod().toLowerCase();
//		HashMap<String, Object> result = new HashMap<>();
		JsonMsg jsonMsg = new JsonMsg();
		if ("post".equals(method)) {
			String idString = request.getParameter("id");
			int id = Integer.parseInt(idString);
			if (schoolService.deleteSchoolById(id)) {
//				result.put("flag", 0);
//				result.put("msg", "编号：[" + id + "]删除成功！");
				jsonMsg.setFlag(0);
				jsonMsg.setMsg("编号：[" + id + "]删除成功！");
			} else {
//				result.put("flag", 1);
//				result.put("msg", "删除失败！");
				jsonMsg.setFlag(1);
				jsonMsg.setMsg("删除失败！");
			}
		} else {
//			result.put("flag", "1");
//			result.put("msg", "请求错误！");
			jsonMsg.setFlag(1);
			jsonMsg.setMsg("请求错误！");
		}
//		JSONObject jsonObject = JSONObject.fromObject(result);
		response.getWriter().print(jsonMsg.toString());
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

	private void success(ModelAndView modelAndView, String msg) {
		modelAndView.setViewName("success");
		modelAndView.addObject("msg", msg);
	}
}

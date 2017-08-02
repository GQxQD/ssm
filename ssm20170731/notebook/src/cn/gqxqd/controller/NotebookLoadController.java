package cn.gqxqd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gqxqd.service.NotebookService;
import cn.gqxqd.util.NoteResult;

@Controller
public class NotebookLoadController {

	@Resource
	private NotebookService notebookService;

	@RequestMapping("/book/load.do")
	@ResponseBody
	public NoteResult execute(String userId) {
		return notebookService.loadUserNotebook(userId);
	}
}

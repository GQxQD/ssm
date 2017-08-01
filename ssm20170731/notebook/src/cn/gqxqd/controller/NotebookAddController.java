package cn.gqxqd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gqxqd.service.NotebookService;
import cn.gqxqd.util.NoteResult;

@Controller
public class NotebookAddController {

	@Resource
	private NotebookService notebookService;

	@RequestMapping("/book/add.do")
	@ResponseBody
	public NoteResult execute(String userId, String bookName) {
		return notebookService.addNotebook(userId, bookName);
	}
}

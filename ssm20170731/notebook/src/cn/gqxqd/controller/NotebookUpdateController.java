package cn.gqxqd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gqxqd.service.NotebookService;
import cn.gqxqd.util.NoteResult;

@Controller
public class NotebookUpdateController {

	@Resource
	private NotebookService notebookService;

	@RequestMapping("/book/rename.do")
	@ResponseBody
	public NoteResult execute(String bookId, String bookName) {
		return notebookService.updateNotebook(bookId, bookName);
	}
}

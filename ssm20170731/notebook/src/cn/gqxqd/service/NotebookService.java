package cn.gqxqd.service;

import cn.gqxqd.util.NoteResult;

public interface NotebookService {

	/**
	 * 通过用户id获取所有笔记本
	 * 
	 * @param userId
	 * @return
	 */
	public NoteResult loadUserNotebook(String userId);

	/**
	 * 添加笔记本
	 * 
	 * @param userId
	 * @param bookName
	 * @return
	 */
	public NoteResult addNotebook(String userId, String bookName);

	/**
	 * 更新笔记本信息
	 * 
	 * @param bookId
	 * @param bookName
	 * @return
	 */
	public NoteResult updateNotebook(String bookId, String bookName);

}

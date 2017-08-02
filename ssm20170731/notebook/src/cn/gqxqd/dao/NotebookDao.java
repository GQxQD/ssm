package cn.gqxqd.dao;

import java.util.List;

import cn.gqxqd.entity.Notebook;

public interface NotebookDao {

	/**
	 * 通过用户ID查找所有笔记本
	 * 
	 * @param userId
	 *            用户id
	 * @return 笔记本列表
	 */
	public List<Notebook> findByUserId(String userId);

	/**
	 * 保存一个新的笔记本
	 * 
	 * @param notebook
	 */
	public void saveNotebook(Notebook notebook);

	/**
	 * 更新笔记本信息
	 * 
	 * @param notebook
	 * @return
	 */
	public int rename(Notebook notebook);
}

package cn.gqxqd.dao;

import cn.gqxqd.entity.Session;

public interface SessionDao {

	public Session find(int id);

	public Session findByUid(int uid);

	public Session findByKey(String key);

	public int save(Session session);

	public int update(Session session);
}

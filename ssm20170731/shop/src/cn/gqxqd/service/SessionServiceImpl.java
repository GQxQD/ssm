package cn.gqxqd.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gqxqd.dao.SessionDao;
import cn.gqxqd.entity.Session;
import cn.gqxqd.util.ShopUtil;

@Service
public class SessionServiceImpl implements SessionService {

	@Resource
	private SessionDao sessionDao;

	@Override
	public Session getSession(int uid) {
		Session session = sessionDao.findByUid(uid);
		if (session == null) {
			session = new Session();
			session.setUser_id(uid);
			session.setToken_key(ShopUtil.getKey());
			int sid = sessionDao.save(session);
			return sessionDao.find(sid);
		} else {
			session.setToken_key(ShopUtil.getKey());
			sessionDao.update(session);
			return session;
		}
	}

}

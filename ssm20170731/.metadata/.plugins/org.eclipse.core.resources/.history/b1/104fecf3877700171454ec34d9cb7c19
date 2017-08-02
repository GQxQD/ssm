package cn.gqxqd.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gqxqd.dao.SessionDao;
import cn.gqxqd.entity.Session;

@Service
public class SessionServiceImpl implements SessionService {

	@Resource
	private SessionDao sessionDao;

	@Override
	public boolean saveSession(Session session) {
		Session session2 = sessionDao.findByUid(session.getUser_id());
		if (session2 == null) {
			int sid = sessionDao.save(session);
			if (sid > 0) {
				return true;
			}
		} else {
			session2.setToken_key(session.getToken_key());
			if (sessionDao.update(session2) > 0) {
				return true;
			}
		}
		return false;
	}

}

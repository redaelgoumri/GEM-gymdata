package ma.xproce.gem.services;

import ma.xproce.gem.dao.entities.Session;

import java.util.List;

public interface SessionManager {
    Session addSession(Session session);
    Session updateSession(Session session);
    boolean deleteSession(Integer id);
    List<Session> getAllSessions();
    Session getSessionById(Integer id);
}

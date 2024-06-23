package ma.xproce.gem.services;

import lombok.RequiredArgsConstructor;
import ma.xproce.gem.dao.entities.Session;
import ma.xproce.gem.dao.repositories.SessionRepository;
import ma.xproce.gem.dao.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SessionService implements SessionManager {
    private final SessionRepository sessionRepository;

    @Override
    public Session addSession(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public Session updateSession(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public boolean deleteSession(Integer id) {
        Optional<Session> clientOptional = sessionRepository.findById(id);
        if (clientOptional.isPresent()) {
            sessionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public Session getSessionById(Integer id) {
        return sessionRepository.findById(id).orElse(null);
    }
}

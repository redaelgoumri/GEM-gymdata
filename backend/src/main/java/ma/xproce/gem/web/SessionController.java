package ma.xproce.gem.web;

import lombok.RequiredArgsConstructor;
import ma.xproce.gem.dao.entities.Session;
import ma.xproce.gem.services.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/sessions")
@RequiredArgsConstructor
public class SessionController {
    private final SessionManager sessionManager;

    @GetMapping
    public List<Session> getAllSessions() {
        return sessionManager.getAllSessions();
    }

    @GetMapping("/{id}")
    public Session getSessionById(@PathVariable Integer id) {
        return sessionManager.getSessionById(id);
    }

    @PostMapping
    public Session addSession(@RequestBody Session session) {
        return sessionManager.addSession(session);
    }

    @PutMapping("/{id}")
    public Session updateSession(@PathVariable Integer id, @RequestBody Session session) {
        session.setId(id);
        return sessionManager.updateSession(session);
    }

    @DeleteMapping("/{id}")
    public boolean deleteSession(@PathVariable Integer id) {
        return sessionManager.deleteSession(id);
    }
}

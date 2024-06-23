package ma.xproce.gem.web;

import lombok.RequiredArgsConstructor;
import ma.xproce.gem.dao.entities.Coach;
import ma.xproce.gem.services.CoachManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/coaches")
@RequiredArgsConstructor
public class CoachController {
    private final CoachManager coachManager;

    @GetMapping
    public List<Coach> getAllCoaches() {
        return coachManager.getAllCoaches();
    }

    @GetMapping("/{id}")
    public Coach getCoachById(@PathVariable Integer id) {
        return coachManager.getCoachById(id);
    }

    @PostMapping
    public Coach addCoach(@RequestBody Coach coach) {
        return coachManager.addCoach(coach);
    }

    @PutMapping("/{id}")
    public Coach updateCoach(@PathVariable Integer id, @RequestBody Coach coach) {
        coach.setId(id);
        return coachManager.updateCoach(coach);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCoach(@PathVariable Integer id) {
        return coachManager.deleteCoach(id);
    }
}

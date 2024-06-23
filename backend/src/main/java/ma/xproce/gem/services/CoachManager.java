package ma.xproce.gem.services;

import ma.xproce.gem.dao.entities.Coach;

import java.util.List;

public interface CoachManager {
    Coach addCoach(Coach coach);
    Coach updateCoach(Coach coach);
    boolean deleteCoach(Integer id);
    List<Coach> getAllCoaches();
    Coach getCoachById(Integer id);
}

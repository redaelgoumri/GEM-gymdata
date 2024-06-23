package ma.xproce.gem.services;

import lombok.RequiredArgsConstructor;
import ma.xproce.gem.dao.entities.Coach;
import ma.xproce.gem.dao.repositories.CoachRepository;
import ma.xproce.gem.dao.repositories.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoachService implements CoachManager {
    private final CoachRepository coachRepository;

    @Override
    public Coach addCoach(Coach client) {
        return coachRepository.save(client);
    }

    @Override
    public Coach updateCoach(Coach client) {
        return coachRepository.save(client);
    }

    @Override
    public boolean deleteCoach(Integer id) {
        Optional<Coach> clientOptional = coachRepository.findById(id);
        if (clientOptional.isPresent()) {
            coachRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

    @Override
    public Coach getCoachById(Integer id) {
        return coachRepository.findById(id).orElse(null);
    }
}

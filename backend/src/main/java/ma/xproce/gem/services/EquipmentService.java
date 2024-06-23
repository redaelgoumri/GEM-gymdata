package ma.xproce.gem.services;

import lombok.RequiredArgsConstructor;
import ma.xproce.gem.dao.entities.Equipment;
import ma.xproce.gem.dao.repositories.EquipmentRepository;
import ma.xproce.gem.dao.repositories.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EquipmentService implements EquipmentManager {
    private final EquipmentRepository coachRepository;

    @Override
    public Equipment addEquipment(Equipment client) {
        return coachRepository.save(client);
    }

    @Override
    public Equipment updateEquipment(Equipment client) {
        return coachRepository.save(client);
    }

    @Override
    public boolean deleteEquipment(Integer id) {
        Optional<Equipment> clientOptional = coachRepository.findById(id);
        if (clientOptional.isPresent()) {
            coachRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Equipment> getAllEquipment() {
        return coachRepository.findAll();
    }

    @Override
    public Equipment getEquipmentById(Integer id) {
        return coachRepository.findById(id).orElse(null);
    }
}

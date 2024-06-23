package ma.xproce.gem.web;

import lombok.RequiredArgsConstructor;
import ma.xproce.gem.dao.entities.Equipment;
import ma.xproce.gem.services.EquipmentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/equipment")
@RequiredArgsConstructor
public class EquipmentController {

    private final EquipmentManager equipmentManager;

    @GetMapping
    public List<Equipment> getAllEquipment() {
        return equipmentManager.getAllEquipment();
    }

    @GetMapping("/{id}")
    public Equipment getEquipmentById(@PathVariable Integer id) {
        return equipmentManager.getEquipmentById(id);
    }

    @PostMapping
    public Equipment addEquipment(@RequestBody Equipment equipment) {
        return equipmentManager.addEquipment(equipment);
    }

    @PutMapping("/{id}")
    public Equipment updateEquipment(@PathVariable Integer id, @RequestBody Equipment equipment) {
        equipment.setId(id);
        return equipmentManager.updateEquipment(equipment);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEquipment(@PathVariable Integer id) {
        return equipmentManager.deleteEquipment(id);
    }
}

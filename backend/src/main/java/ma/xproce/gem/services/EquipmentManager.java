package ma.xproce.gem.services;

import ma.xproce.gem.dao.entities.Equipment;

import java.util.List;

public interface EquipmentManager {
    Equipment addEquipment(Equipment equipment);
    Equipment updateEquipment(Equipment equipment);
    boolean deleteEquipment(Integer id);
    List<Equipment> getAllEquipment();
    Equipment getEquipmentById(Integer id);
}

package com.radness.sf.equipment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public Optional<Equipment> getEquipment(String equipmentId) {
        return equipmentRepository.findById(equipmentId);
    }

    public void addEquipment(Equipment equipment) {
        equipmentRepository.save(equipment);
    }

    public void deleteEquipment(String equipmentId) {
        equipmentRepository.deleteById(equipmentId);
    }
}

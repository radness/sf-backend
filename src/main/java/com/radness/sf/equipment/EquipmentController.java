package com.radness.sf.equipment;

import com.radness.sf.material.Material;
import com.radness.sf.material.MaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v3/equipments")
@RequiredArgsConstructor
public class EquipmentController {

    private final EquipmentService equipmentService;

    @GetMapping("/{equipmentId}")
    public Optional<Equipment> viewEquipment(@PathVariable("equipmentId") String equipmentId) throws Exception {
        return equipmentService.getEquipment(equipmentId);
    }

    @PostMapping()
    public void newEquipment(@RequestBody Equipment equipment) {
        equipmentService.addEquipment(equipment);
    }

    @DeleteMapping("/{equipmentId}")
    public void deleteEquipment(@PathVariable("equipmentId") String equipmentId) {
        equipmentService.deleteEquipment(equipmentId);
    }
}

package com.radness.sf.inventory.lot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v3/inventory/lot")
@RequiredArgsConstructor
public class InevntoryLotController {

    private final InventoryLotService inventoryLotService;

    @GetMapping("/{invLotId}")
    public Optional<InventoryLot> getInventoryLot(@PathVariable String invLotId) {
        return inventoryLotService.getInventoryLot(invLotId);
    }

}

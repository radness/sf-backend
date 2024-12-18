package com.radness.sf.inventory.lot.history;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Tag(name = "Inventory LOT History(자재 LOT 이력)")
@RestController
@RequestMapping("/v3/inventory/lot/history")
@RequiredArgsConstructor
public class InventoryLotHistoryController {

    private final InventoryLotHistoryService inventoryLotHistoryService;

    @Tag(name = "자재 LOT 이력")
    @GetMapping("/{invLotId}")
    public Optional<InventoryLotHistory> getInventoryLotHistory(@PathVariable String invLotId) {
        return inventoryLotHistoryService.getInventoryLotHistory(invLotId);
    }

    @Tag(name = "자재 LOT 이력 목록")
    @GetMapping()
    public List<InventoryLotHistory> getInventoryLotHistories() {
        return inventoryLotHistoryService.getInventoryLotHistories();
    }
}

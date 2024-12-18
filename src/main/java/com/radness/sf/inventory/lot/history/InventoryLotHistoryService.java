package com.radness.sf.inventory.lot.history;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryLotHistoryService {

    private final InventoryLotHistoryRepository inventoryLotHistoryRepository;

    public Optional<InventoryLotHistory> getInventoryLotHistory(String invLotId) {
        return inventoryLotHistoryRepository.findById(invLotId);
    }

    public List<InventoryLotHistory> getInventoryLotHistories() {
        return null;
    }
}

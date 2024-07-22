package com.radness.sf.inventory.lot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class InventoryLotService {

    private final InventoryLotRepository inventoryLotRepository;

    public Optional<InventoryLot> getInventoryLot(String invLotId) {
        return inventoryLotRepository.findById(invLotId);
    }
}

package com.radness.sf.inventory.shipment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public Optional<Shipment> getShipment(String id) {
        return shipmentRepository.findById(id);
    }
}

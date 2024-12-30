package com.radness.sf.inventory.shipment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/v3/inventory/shipment")
@RequiredArgsConstructor
public class ShipmentController {

    private final ShipmentService shipmentService;

    @GetMapping("/{id}")
    public Optional<Shipment> getShipment(@PathVariable String id) {
        return shipmentService.getShipment(id);
    }

}

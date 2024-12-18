package com.radness.sf.inventory.delivery;

import com.radness.sf.inventory.delivery.detail.DeliveryDetail;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Inventory Delivery (납품서)")
@RestController
@RequestMapping("/v3/inventory/deliveries")
@RequiredArgsConstructor
public class InventoryDeliveryController {

    private final InventoryDeliveryService inventoryDeliveryService;
    private final ServerProperties serverProperties;

    @Tag(name = "납품서 조회")
    @GetMapping("/{deliveryNumber}")
    public Optional<Delivery> getDelivery(@PathVariable String deliveryNumber) {
        return inventoryDeliveryService.getDelivery(deliveryNumber);
    }

    @Tag(name = "납품서 수정")
    @PutMapping("/{deliveryNumber}")
    public Optional<Delivery> updateDelivery(@PathVariable String deliveryNumber, @RequestBody Delivery delivery) {
        return inventoryDeliveryService.updateDelivery(deliveryNumber, delivery);
    }

    @Tag(name = "납품서 목록 저장")
    @PostMapping()
    public Optional<Delivery> saveDeliveries(@RequestBody Delivery delivery) {
        return inventoryDeliveryService.saveDeliveries(delivery);
    }

    @Tag(name = "납품서 삭제")
    @DeleteMapping("/{deliveryNumber}")
    public void deleteDelivery(@PathVariable String deliveryNumber) {
        inventoryDeliveryService.deleteDelivery(deliveryNumber);
    }

    @Tag(name = "납품서 상세 목록 조회")
    @GetMapping("/{deliveryNumber}/details")
    public List<DeliveryDetail> getDeliveryDetails(@PathVariable String deliveryNumber) {
        return inventoryDeliveryService.getDeliveryDetails(deliveryNumber);
    }

    @Tag(name = "납품서 상세 목록 저장")
    @PostMapping("/{deliveryNumber}/details")
    public void saveDeliveryDetails(@PathVariable String deliveryNumber, @RequestBody DeliveryDetail deliveryDetail) {
        inventoryDeliveryService.saveDeliveryDetails(deliveryNumber, deliveryDetail);
    }
}

package com.radness.sf.inventory.delivery;

import com.radness.sf.inventory.delivery.detail.DeliveryDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryDeliveryService {

    private final InventoryDeliveryRepository inventoryDeliveryRepository;

    public Optional<Delivery> getDelivery(String deliveryNumber) {
        return inventoryDeliveryRepository.findById(deliveryNumber);
    }

    public Optional<Delivery> updateDelivery(String deliveryNumber, Delivery delivery) {
        return Optional.of(inventoryDeliveryRepository.save(delivery));
    }

    public Optional<Delivery> saveDeliveries(Delivery delivery) {
        return Optional.of(inventoryDeliveryRepository.save(delivery));
    }

    public void deleteDelivery(String deliveryNumber) {
        inventoryDeliveryRepository.deleteById(deliveryNumber);
    }

    public List<DeliveryDetail> getDeliveryDetails(String deliveryNumber) {
        return null;
    }

    public void saveDeliveryDetails(String deliveryNumber, DeliveryDetail deliveryDetail) {
    }
}

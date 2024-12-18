package com.radness.sf.inventory.current;

import com.radness.sf.inventory.lot.InventoryLot;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Inventory(자재)")
@RestController
@RequestMapping("/v3/inventory/current")
@RequiredArgsConstructor
public class CurrentInventoryController {

    @Tag(name = "현재고 목록")
    @GetMapping()
    public List<InventoryLot> currentInventory() {
        return null;
    }

    @Tag(name = "현재고 상세 목록")
    @GetMapping("/detail")
    public InventoryLot currentInventoryDetail() {
        return null;
    }
}

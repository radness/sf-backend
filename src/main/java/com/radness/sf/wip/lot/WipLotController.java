package com.radness.sf.wip.lot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/wip/lot")
public class WipLotController {

    private final WipLotService wipLotService;

    @GetMapping("/{wipLotId}")
    public Optional<WipLot> viewWipLot(@PathVariable String wipLotId) {
        return wipLotService.getWipLot(wipLotId);
    }

    @PostMapping()
    public WipLot createWipLot(@RequestBody WipLot wipLot) {
        return wipLotService.createWipLot(wipLot);
    }

    @DeleteMapping("/{wipLotId}")
    public void deleteWipLot(@PathVariable String wipLotId) {
        wipLotService.deleteWipLot(wipLotId);
    }
}

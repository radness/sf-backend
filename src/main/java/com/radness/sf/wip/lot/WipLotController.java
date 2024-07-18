package com.radness.sf.wip.lot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/wip/lots")
public class WipLotController {

    private final WipLotService wipLotService;

    @GetMapping("/{lotId}")
    public Optional<WipLot> viewWipLot(@PathVariable String lotId) {
        return wipLotService.getWipLot(lotId);
    }

    @PostMapping()
    public WipLot createWipLot(@RequestBody WipLot wipLot) {
        return wipLotService.createWipLot(wipLot);
    }

    @DeleteMapping("/{lotId}")
    public void deleteWipLot(@PathVariable String lotId) {
        wipLotService.deleteWipLot(lotId);
    }
}

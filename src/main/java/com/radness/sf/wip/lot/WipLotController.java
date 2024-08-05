package com.radness.sf.wip.lot;

import com.radness.sf.wip.lot.history.WipLotHistory;
import com.radness.sf.wip.lot.move.MoveWipLot;
import com.radness.sf.wip.lot.split.SplitWipLot;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping()
    public Optional<List<WipLot>> viewWipLotList(@RequestParam String lotId) {
        return wipLotService.getWipLotList(lotId);
    }

    @GetMapping("/{lotId}/history")
    public Optional<List<WipLotHistory>> viewWipLotHistory(@PathVariable String lotId) {
        return wipLotService.getWipLotHistory(lotId);
    }

    @PostMapping("/{lotId}/create")
    public WipLot createWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.createWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/start")
    public WipLot startWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.startWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/end")
    public Optional<WipLot> endWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.endWipLot(lotId, wipLot);
    }

    @DeleteMapping("/{lotId}")
    public void deleteWipLot(@PathVariable String lotId) {
        wipLotService.deleteWipLot(lotId);
    }

    @PostMapping("/{lotId}/pull")
    public WipLot pullWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.pullWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/move")
    public WipLot moveWipLot(@PathVariable String lotId, @RequestBody MoveWipLot wipLot) {
        return wipLotService.moveWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/split")
    public WipLot splitWipLot(@PathVariable String lotId, @RequestBody SplitWipLot wipLot) {
        return wipLotService.splitWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/merge")
    public WipLot mergeWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.mergeWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/hold")
    public WipLot holdWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.holdWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/release")
    public WipLot releaseWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.releaseWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/rework")
    public WipLot reworkWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.reworkWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/loss")
    public WipLot lossWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.lossWipLot(lotId, wipLot);
    }

    @PostMapping("/{lotId}/correction")
    public WipLot correctionWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.correctionWipLot(lotId, wipLot);
    }

}

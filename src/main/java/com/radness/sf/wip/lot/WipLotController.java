package com.radness.sf.wip.lot;

import com.radness.sf.wip.lot.history.WipLotHistory;
import com.radness.sf.wip.lot.move.WipLotMove;
import com.radness.sf.wip.lot.split.WipLotSplit;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Work In Process Lot(재공 LOT)")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/wip/lots")
public class WipLotController {

    private final WipLotService wipLotService;

    @Tag(name = "WIP LOT 조회")
    @GetMapping("/{lotId}")
    public Optional<WipLot> viewWipLot(@PathVariable String lotId) {
        return wipLotService.getWipLot(lotId);
    }

    @Tag(name = "WIP LOT 목록 조회")
    @GetMapping()
    public Optional<List<WipLot>> viewWipLotList(@RequestParam String lotId) {
        return wipLotService.getWipLotList(lotId);
    }

    @Tag(name = "WIP LOT 이력 조회")
    @GetMapping("/{lotId}/history")
    public Optional<List<WipLotHistory>> viewWipLotHistory(@PathVariable String lotId) {
        return wipLotService.getWipLotHistory(lotId);
    }

    @Tag(name = "WIP LOT 생성")
    @PostMapping("/{lotId}/create")
    public WipLot createWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.createWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 시작")
    @PostMapping("/{lotId}/start")
    public WipLot startWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.startWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 종료")
    @PostMapping("/{lotId}/end")
    public Optional<WipLot> endWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.endWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 삭제")
    @DeleteMapping("/{lotId}")
    public void deleteWipLot(@PathVariable String lotId) {
        wipLotService.deleteWipLot(lotId);
    }

    @Tag(name = "WIP LOT 당김")
    @PostMapping("/{lotId}/pull")
    public WipLot pullWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.pullWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 이동")
    @PostMapping("/{lotId}/move")
    public WipLot moveWipLot(@PathVariable String lotId, @RequestBody WipLotMove wipLot) {
        return wipLotService.moveWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 분할")
    @PostMapping("/{lotId}/split")
    public WipLot splitWipLot(@PathVariable String lotId, @RequestBody WipLotSplit wipLot) {
        return wipLotService.splitWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 병합")
    @PostMapping("/{lotId}/merge")
    public WipLot mergeWipLot(@PathVariable String lotId, @RequestBody String targetLotId) {
        return wipLotService.mergeWipLot(lotId, targetLotId);
    }

    @Tag(name = "WIP LOT 잠금")
    @PostMapping("/{lotId}/hold")
    public WipLot holdWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.holdWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 잠금 해제")
    @PostMapping("/{lotId}/release")
    public WipLot releaseWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.releaseWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 재작업")
    @PostMapping("/{lotId}/rework")
    public WipLot reworkWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.reworkWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 불량")
    @PostMapping("/{lotId}/loss")
    public WipLot lossWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.lossWipLot(lotId, wipLot);
    }

    @Tag(name = "WIP LOT 데이터 수집")
    @PostMapping("/{lotId}/correction")
    public WipLot correctionWipLot(@PathVariable String lotId, @RequestBody WipLot wipLot) {
        return wipLotService.correctionWipLot(lotId, wipLot);
    }

}

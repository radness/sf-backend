package com.radness.sf.inventory.lot;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Inventory Lot(자재 LOT)")
@RestController
@RequestMapping("/v3/inventory/lot")
@RequiredArgsConstructor
public class InevntoryLotController {

    private final InventoryLotService inventoryLotService;


    @Tag(name = "재고 LOT 조회")
    @GetMapping("/{invLotId}")
    public Optional<InventoryLot> getInventoryLot(@PathVariable String invLotId) {
        return inventoryLotService.getInventoryLot(invLotId);
    }
    @Tag(name = "재고 LOT 목록 조회")
    @GetMapping()
    public List<InventoryLot> getInventoryLots() {
        return null;
    }

    @Tag(name = "재고 가입고")
    @PostMapping("/{invLotId}/tempIn")
    public InventoryLot tempInInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 입고")
    @PostMapping("/{invLotId}/in")
    public InventoryLot inInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "즉시 입고")
    @PostMapping("/{invLotId}/directIn")
    public InventoryLot directInInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "기타 입고")
    @PostMapping("/{invLotId}/etcIn")
    public InventoryLot etcInInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 기타 출고")
    @PostMapping("/{invLotId}/etcOut")
    public InventoryLot etcOutInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 반품")
    @PostMapping("/{invLotId}/return")
    public InventoryLot returnInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 불출")
    @PostMapping("/{invLotId}/send")
    public InventoryLot sendInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 투입")
    @PostMapping("/{invLotId}/load")
    public InventoryLot loadInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 투입 해제")
    @PostMapping("/{invLotId}/unload")
    public InventoryLot unloadInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 조립")
    @PostMapping("/{invLotId}/assembly")
    public  InventoryLot assemblyInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 조립 해제")
    @PostMapping("/{invLotId}/disassembly")
    public InventoryLot disassemblyInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 출하 창고 입고")
    @PostMapping("/{invLotId}/warehousing")
    public InventoryLot warehousingInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 생산 창고 입고")
    @PostMapping("/{invLotId}/prodWarehousing")
    public InventoryLot prodWarehousingInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 즉시 불출")
    @PostMapping("/{invLotId}/directSend")
    public InventoryLot directSendInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 생산 창고 반납")
    @PostMapping("/{invLotId}/prodReturn")
    public InventoryLot prodReturnInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 재공 전환")
    @PostMapping("/{invLotId}/conversionWip")
    public InventoryLot conversionWipInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 출하")
    @PostMapping("/{invLotId}/ship")
    public InventoryLot shipInventoryLot(@PathVariable String invLotId, InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 출하 취소")
    @PostMapping("/{invLotId}/unShip")
    public InventoryLot unShipInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 이동")
    @PostMapping("/{invLotId}/move")
    public InventoryLot moveInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 분할")
    @PostMapping("/{invLotId}/split")
    public InventoryLot splitInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 병합")
    @PostMapping("/{invLotId}/merge")
    public InventoryLot mergeInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 잠금")
    @PostMapping("/{invLotId}/hold")
    public InventoryLot holdInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 잠금 해제")
    @PostMapping("/{invLotId}/release")
    public InventoryLot releaseInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 유실")
    @PostMapping("/{invLotId}/loss")
    public InventoryLot lossInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 수량 조정")
    @PostMapping("/{invLotId}/changeValue")
    public InventoryLot changeValueInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 실사")
    @PostMapping("/{invLotId}/check")
    public InventoryLot checkInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 보정")
    @PostMapping("/{invLotId}/correction")
    public InventoryLot correctionInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 출하 예정")
    @PostMapping("/{invLotId}/shipSchedule")
    public InventoryLot shipScheduleInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 출하 예정 취소")
    @PostMapping("/{invLotId}/shipScheduleCancel")
    public InventoryLot shipScheduleCancelInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 출하 확정")
    @PostMapping("/{invLotId}/shipConfirm")
    public InventoryLot shipConfirmInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 이송 입고")
    @PostMapping("/{invLotId}/transferIn")
    public InventoryLot transferInInventoryLot(InventoryLot inventoryLot) {
        return null;
    }

    @Tag(name = "재고 이력 삭제")
    @PostMapping("/{invLotId}/histories/{seq}")
    public InventoryLot deleteHistoryInventoryLot(@PathVariable String invLotId, @PathVariable String seq) {
        return null;
    }

}

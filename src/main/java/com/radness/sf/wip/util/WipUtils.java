package com.radness.sf.wip.util;

import com.radness.sf.operation.Operation;
import com.radness.sf.operation.OperationRepository;
import com.radness.sf.wip.lot.WipLotStatus;
import com.radness.sf.wip.lot.history.WipLotHistory;
import com.radness.sf.wip.lot.history.WipLotHistoryId;
import com.radness.sf.wip.lot.history.WipLotHistoryRepository;
import com.radness.sf.wip.lot.WipLot;
import com.radness.sf.wip.lot.WipLotRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WipUtils {

    private static WipLotRepository wipLotRepository;
    private static WipLotHistoryRepository wipLotHistoryRepository;
    private static ModelMapper modelMapper;
    private static OperationRepository operationRepository;

    @Autowired
    public void setWipLotRepository(WipLotRepository wipLotRepository) {
        WipUtils.wipLotRepository = wipLotRepository;
    }
    @Autowired
    public void setWipLotHistoryRepository(WipLotHistoryRepository wipLotHistoryRepository) {
        WipUtils.wipLotHistoryRepository = wipLotHistoryRepository;
    }
    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        WipUtils.modelMapper = modelMapper;
    }

    public static void saveWipLotAndHistory(WipLot wipLot) {
        wipLotRepository.save(wipLot);
        WipLotHistory wipLotHistory = new WipLotHistory();
        modelMapper.map(wipLot, wipLotHistory);
        wipLotHistoryRepository.save(wipLotHistory);
    }

    public static void updateWipLotAndHistory(String tranCode, WipLot wipLot, WipLot previousWipLot) {
        Date tranDateTime = new Timestamp(System.currentTimeMillis());

        Optional<Operation> operation = operationRepository.findById(wipLot.getOperationId());
        if (operation.isPresent()) {
            if (!operation.get().getUnit().isEmpty()) {
                wipLot.setUnit(operation.get().getUnit());
            }
        }

        // TODO : 로그인한 사용자 정보를 통한 factoryId 가져오게 변경
        WipLotHistory lastWipLotHistory = wipLotHistoryRepository.findLastWipLotHistory("1000", wipLot.getWipLotId())
                .orElseThrow(() -> new IllegalArgumentException("WipLotHistory not found"));
        lastWipLotHistory.setCreateQty(wipLot.getQty());
        lastWipLotHistory.setChangeQty(wipLot.getQty());
        lastWipLotHistory.setTransactionDateTime(tranDateTime);
        lastWipLotHistory.setUpdateDateTime(tranDateTime);
        wipLotHistoryRepository.save(lastWipLotHistory);

    }
}

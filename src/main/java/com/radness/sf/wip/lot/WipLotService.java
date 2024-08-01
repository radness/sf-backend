package com.radness.sf.wip.lot;

import com.radness.sf.operation.Operation;
import com.radness.sf.operation.OperationRepository;
import com.radness.sf.routing.operation.NextRoutingOperation;
import com.radness.sf.routing.operation.RoutingOperation;
import com.radness.sf.wip.lot.history.WipLotHistory;
import com.radness.sf.wip.lot.move.MoveWipLot;
import com.radness.sf.wip.util.WipLotTransactionType;
import com.radness.sf.wip.util.WipUtils;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WipLotService {

    private final WipLotRepository wipLotRepository;
    private final ModelMapper modelMapper;
    private final OperationRepository operationRepository;

    public Optional<WipLot> getWipLot(String wipLotId) {
        return wipLotRepository.findById(wipLotId);
    }

    public WipLot createWipLot(String lotId, WipLot input) {
        Optional<WipLot> wipLot = wipLotRepository.findById(lotId);
        if (wipLot.isPresent()) {
            throw new IllegalArgumentException("WipLot with id " + lotId + " already exists");
        }
        return wipLotRepository.save(input);
    }

    public void deleteWipLot(String wipLotId) {
        wipLotRepository.deleteById(wipLotId);
    }

    public WipLot startWipLot(String lotId, WipLot input) {
        WipLot wipLot = wipLotRepository.findById(lotId)
                .orElseThrow(() -> new IllegalArgumentException("wip lot does not exist."));
        if (wipLot.isStart()) {
            throw new IllegalArgumentException("wip lot is already started.");
        }
        modelMapper.map(input, wipLot);
        wipLot.setStart(true);
        wipLot.setLotStatus(WipLotStatus.PROCESS);
        WipUtils.saveWipLotAndHistory(wipLot);

        return wipLot;
    }

    public Optional<List<WipLot>> getWipLotList(String lotId) {
        return Optional.empty();
    }

    public Optional<List<WipLotHistory>> getWipLotHistory(String lotId) {
        return Optional.empty();
    }

    public Optional<WipLot> endWipLot(String lotId, WipLot input) {
        WipLot wipLot = wipLotRepository.findById(lotId)
                .orElseThrow(() -> new IllegalArgumentException("wip lot does not exist."));
        Optional<Operation> operation = operationRepository.findById(input.getOperationId());
        if (operation.isPresent()) {
            WipLot previousWipLot = new ModelMapper().map(wipLot, WipLot.class);
            modelMapper.map(input, wipLot);
            wipLot.setEnd(true);
            wipLot.setLotStatus(WipLotStatus.END);
            WipUtils.updateWipLotAndHistory(String.valueOf(WipLotStatus.END), wipLot, previousWipLot);
        }
        return Optional.ofNullable(wipLot);
    }

    public WipLot pullWipLot(String lotId, WipLot input) {
        WipLot wipLot = wipLotRepository.findById(input.getWipLotId())
                .orElseThrow(() -> new IllegalArgumentException("wip lot does not exist."));
        Operation operation = operationRepository.findById(wipLot.getOperationId())
                .orElseThrow(() -> new IllegalArgumentException("operation does not exist."));
        if (!operation.isPull()) {
            throw new IllegalArgumentException("operation is not pull.");
        }
        if (!wipLot.isEnd()) {
            throw new IllegalArgumentException("wip lot status is not end.");
        }
        WipLot previousWipLot = new ModelMapper().map(wipLot, WipLot.class);
        modelMapper.map(input, wipLot);
        // TODO : 다음 공정 가져오기
        NextRoutingOperation nextOperation = WipUtils.getNextOperation(wipLot);
        modelMapper.map(nextOperation, wipLot);
        wipLot.setLotStatus(WipLotStatus.WAIT);
        WipUtils.updateWipLotAndHistory(String.valueOf(WipLotTransactionType.PULL), wipLot, previousWipLot);
        return wipLot;
    }

    public WipLot moveWipLot(MoveWipLot input) {
        WipLot wipLot = wipLotRepository.findById(input.getWipLotId())
                .orElseThrow(() -> new IllegalArgumentException("wip lot does not exist."));
        Operation operation = operationRepository.findById(wipLot.getOperationId())
                .orElseThrow(() -> new IllegalArgumentException("operation does not exist."));
        if (operation.isPull()) {
            NextRoutingOperation nextOperation = WipUtils.getNextOperation(wipLot);
            if (nextOperation.getOperationId() != null && nextOperation.getOperationId().equals(input.getNextOperationId())) {
                throw new IllegalArgumentException("operation is already pull.");
            }
        }
        WipLot previousWipLot = new ModelMapper().map(wipLot, WipLot.class);
        modelMapper.map(input, wipLot);
        wipLot.setRoutingId(input.getNextOperationId());
        wipLot.setOperationId(input.getCurrentOperationId());
        wipLot.setLotStatus(WipLotStatus.WAIT);
        WipUtils.updateWipLotAndHistory(String.valueOf(WipLotTransactionType.MOVE), wipLot, previousWipLot);
        return wipLot;
    }

    public WipLot splitWipLot(String lotId, WipLot wipLot) {
        return null;
    }

    public WipLot mergeWipLot(String lotId, WipLot wipLot) {
        return null;
    }

    public WipLot holdWipLot(String lotId, WipLot wipLot) {
        return null;
    }

    public WipLot releaseWipLot(String lotId, WipLot wipLot) {
        return null;
    }

    public WipLot reworkWipLot(String lotId, WipLot wipLot) {
        return null;
    }

    public WipLot lossWipLot(String lotId, WipLot wipLot) {
        return null;
    }

    public WipLot correctionWipLot(String lotId, WipLot wipLot) {
        return null;
    }
}

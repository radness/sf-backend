package com.radness.sf.wip.lot;

import com.radness.sf.wip.lot.history.WipLotHistory;
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
        wipLot.setLotStatus(WIpLotStatus.PROCESS);
        WipUtils.saveWipLotAndHistory(wipLot);

        return wipLot;
    }

    public Optional<List<WipLot>> getWipLotList(String lotId) {
        return null;
    }

    public Optional<List<WipLotHistory>> getWipLotHistory(String lotId) {
        return null;
    }

    public WipLot endWipLot(String lotId, WipLot wipLot) {
        return null;
    }

    public WipLot pullWipLot(String lotId, WipLot wipLot) {
        return null;
    }

    public WipLot moveWipLot(String lotId, WipLot wipLot) {
        return null;
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

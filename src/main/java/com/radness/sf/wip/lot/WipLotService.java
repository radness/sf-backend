package com.radness.sf.wip.lot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WipLotService {

    private final WipLotRepository wipLotRepository;

    public Optional<WipLot> getWipLot(String wipLotId) {
        return wipLotRepository.findById(wipLotId);
    }

    public WipLot createWipLot(WipLot wipLot) {
        return wipLotRepository.save(wipLot);
    }

    public void deleteWipLot(String wipLotId) {
        wipLotRepository.deleteById(wipLotId);
    }

    public void startWipLot(String wipLotId) {
        WipLot wipLot = wipLotRepository.findById(wipLotId)
                .orElseThrow(() -> new IllegalArgumentException("wip lot does not exist."));
        if (wipLot.isStart()) {
            throw new IllegalArgumentException("wip lot is already started.");
        }

    }
}

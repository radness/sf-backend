package com.radness.sf.wip.lot;

import com.radness.sf.order.OrderRepository;
import com.radness.sf.wip.lot.history.WipLotHistoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WipLotService {

    private final WipLotRepository wipLotRepository;
    private final WipLotHistoryRepository wipLotHistoryRepository;
    private final OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    public Optional<WipLot> getWipLot(String wipLotId) {
        return wipLotRepository.findById(wipLotId);
    }

    public WipLot createWipLot(WipLot wipLot) {
        return wipLotRepository.save(wipLot);
    }

    public void deleteWipLot(String wipLotId) {
        wipLotRepository.deleteById(wipLotId);
    }

    public void startWipLot(WipLot input) {
        WipLot wipLot = wipLotRepository.findById(input.getWipLotId())
                .orElseThrow(() -> new IllegalArgumentException("wip lot does not exist."));
        if (wipLot.isStart()) {
            throw new IllegalArgumentException("wip lot is already started.");
        }
        modelMapper.map(input, wipLot);
        wipLot.setStart(true);
        wipLot.setLotStatus(WIpLotStatus.PROCESS);
        this.saveLotAndHistory(wipLot);
    }

    public void saveLotAndHistory(WipLot wipLot) {

    }

}

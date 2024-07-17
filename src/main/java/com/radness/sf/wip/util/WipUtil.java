package com.radness.sf.wip.util;

import com.radness.sf.wip.lot.history.WipLotHistory;
import com.radness.sf.wip.lot.history.WipLotHistoryRepository;
import com.radness.sf.wip.lot.WipLot;
import com.radness.sf.wip.lot.WipLotRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WipUtil {

    private static WipLotRepository wipLotRepository;
    private static WipLotHistoryRepository wipLotHistoryRepository;
    private static ModelMapper modelMapper;

    @Autowired
    public void setWipLotRepository(WipLotRepository wipLotRepository) {
        WipUtil.wipLotRepository = wipLotRepository;
    }
    @Autowired
    public void setWipLotHistoryRepository(WipLotHistoryRepository wipLotHistoryRepository) {
        WipUtil.wipLotHistoryRepository = wipLotHistoryRepository;
    }
    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        WipUtil.modelMapper = modelMapper;
    }

    public static void saveWipLotAndHistory(WipLot wipLot) {
        wipLotRepository.save(wipLot);
        WipLotHistory wipLotHistory = new WipLotHistory();
        modelMapper.map(wipLot, wipLotHistory);
        wipLotHistoryRepository.save(wipLotHistory);
    }
}

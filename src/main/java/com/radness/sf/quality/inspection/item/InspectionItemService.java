package com.radness.sf.quality.inspection.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InspectionItemService {

    private final InspectionItemRepository inspectionItemRepository;

    public InspectionItem getInspectionItem(String inspectionItemId) {
        return inspectionItemRepository.findByInspectionItemCode(inspectionItemId);
    }
}

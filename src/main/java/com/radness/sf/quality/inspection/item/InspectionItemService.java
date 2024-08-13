package com.radness.sf.quality.inspection.item;

import java.util.Optional;

public class InspectionItemService {

    private final InspectionItemRepository inspectionItemRepository;

    public InspectionItemService(InspectionItemRepository inspectionItemRepository) {
        this.inspectionItemRepository = inspectionItemRepository;
    }

    public InspectionItem get(Long inspectionItemId) {
        return inspectionItemRepository.findByInspectionItemCode(inspectionItemId);
    }

    public InspectionItem create(InspectionItem inspectionItem) {
        return inspectionItemRepository.save(inspectionItem);
    }
}

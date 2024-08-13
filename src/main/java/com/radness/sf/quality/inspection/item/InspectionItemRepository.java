package com.radness.sf.quality.inspection.item;

import java.util.Optional;

public interface InspectionItemRepository {

    InspectionItem findByInspectionItemCode(Long inspectionItemCode);

    InspectionItem save(InspectionItem inspectionItem);
}

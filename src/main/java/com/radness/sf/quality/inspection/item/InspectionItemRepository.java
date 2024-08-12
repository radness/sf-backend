package com.radness.sf.quality.inspection.item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionItemRepository extends JpaRepository<InspectionItem, String> {

    InspectionItem findByInspectionItemCode(String inspectionItemId);

}

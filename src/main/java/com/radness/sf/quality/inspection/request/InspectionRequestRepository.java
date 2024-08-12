package com.radness.sf.quality.inspection.request;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InspectionRequestRepository {

    Optional<InspectionRequest> findByInspectionId(Long inspectionId);

    Optional<InspectionRequest> findByInspectionDescription(String inspectionDescription);

    List<InspectionRequest> findAll();

    InspectionRequest save(InspectionRequest inspectionRequest);

}

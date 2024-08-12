package com.radness.sf.quality.inspection.request;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InspectionRequestRepository extends JpaRepository<InspectionRequest, String> {

    Optional<InspectionRequest> findByInspectionId(String inspectionId);
}

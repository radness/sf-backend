package com.radness.sf.quality.inspection.request;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

public class InspectionRequestService {

    private final InspectionRequestRepository inspectionRequestRepository;

    public InspectionRequestService(InspectionRequestRepository inspectionRequestRepository) {
        this.inspectionRequestRepository = inspectionRequestRepository;
    }

    public Optional<InspectionRequest> getInspectionRequest(Long inspectionId) {
        return inspectionRequestRepository.findByInspectionId(inspectionId);
    }

    public InspectionRequest create(InspectionRequest inspectionRequest) {
        return inspectionRequestRepository.save(inspectionRequest);
    }
}

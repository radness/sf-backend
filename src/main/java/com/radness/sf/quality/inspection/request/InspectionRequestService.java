package com.radness.sf.quality.inspection.request;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InspectionRequestService {

    private final InspectionRequestRepository inspectionRequestRepository;

    public Optional<InspectionRequest> getInspectionRequest(String inspectionId) {
        return inspectionRequestRepository.findByInspectionId(inspectionId);
    }
}

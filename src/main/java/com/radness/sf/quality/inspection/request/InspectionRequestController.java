package com.radness.sf.quality.inspection.request;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v3/quality/inspectionRequest")
@RequiredArgsConstructor
public class InspectionRequestController {

    private final InspectionRequestService inspectionRequestService;

    @GetMapping("/{inspectionId}")
    public Optional<InspectionRequest> getInspectionRequest(@PathVariable String inspectionId) {
        return inspectionRequestService.getInspectionRequest(inspectionId);
    }
}

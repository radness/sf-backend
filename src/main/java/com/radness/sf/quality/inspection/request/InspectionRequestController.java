package com.radness.sf.quality.inspection.request;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v3/quality/inspectionRequest")
@RequiredArgsConstructor
public class InspectionRequestController {

    private final InspectionRequestService inspectionRequestService;

    @GetMapping("/{inspectionId}")
    public Optional<InspectionRequest> getInspectionRequest(@PathVariable Long inspectionId) {
        return inspectionRequestService.getInspectionRequest(inspectionId);
    }

    @PostMapping()
    public InspectionRequest create(@RequestBody InspectionRequest inspectionRequest) {
        return inspectionRequestService.create(inspectionRequest);
    }
}

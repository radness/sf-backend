package com.radness.sf.quality.inspection.item;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/quality/inspectionItems")
public class InspectionItemController {

    private final InspectionItemService inspectionItemService;

    @GetMapping("/{inspectionItemId}")
    public InspectionItem getInspectionItem(@PathVariable Long inspectionItemId) {
        return inspectionItemService.get(inspectionItemId);
    }

    @PostMapping
    public InspectionItem createInspectionItem(@RequestBody InspectionItem inspectionItem) {
        return inspectionItemService.create(inspectionItem);
    }
}

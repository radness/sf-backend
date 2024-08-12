package com.radness.sf.quality.inspection.item;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/quality/inspectionItems")
public class InspectionItemController {

    private final InspectionItemService inspectionItemService;

    @GetMapping("/{inspectionItemId}")
    public InspectionItem getInspectionItem(@PathVariable String inspectionItemId) {
        return inspectionItemService.getInspectionItem(inspectionItemId);
    }
}

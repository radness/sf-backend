package com.radness.sf.bom;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/boms")
public class BomController {

    private final BomService bomService;

    @GetMapping("/{materialId}")
    public List<Bom> getBomList(@PathVariable("materialId") String materialId) {
        return bomService.getBomList(materialId);
    }
}

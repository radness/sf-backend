package com.radness.sf.material;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/materials")
@RequiredArgsConstructor
public class MaterialController {

    private MaterialService materialService;

    @GetMapping("/{materialId}")
    public Optional<Material> viewMaterial(@PathVariable("materialId") String materialId) throws Exception {
        return materialService.getMaterial(materialId);
    }

    @PostMapping()
    public void newMaterial(@RequestBody Material material) {
        materialService.addMaterial(material);
    }

    @DeleteMapping()
    public void deleteMaterial(@RequestBody Material material) {
        materialService.deleteMaterial(material);
    }
}

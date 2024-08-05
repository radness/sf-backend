package com.radness.sf.material;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v3/materials")
@RequiredArgsConstructor
public class MaterialController {

    private final MaterialService materialService;

    @GetMapping("/{materialId}")
    public Optional<Material> getMaterial(@PathVariable("materialId") String materialId) throws Exception {
        return materialService.getMaterial(materialId);
    }

    @GetMapping()
    public List<Material> getAllMaterials() {
        return materialService.getMaterial();
    }

    @PostMapping()
    public void addMaterial(@RequestBody Material material) {
        materialService.addMaterial(material);
    }

    @DeleteMapping()
    public void deleteMaterial(@RequestBody Material material) {
        materialService.deleteMaterial(material);
    }
}

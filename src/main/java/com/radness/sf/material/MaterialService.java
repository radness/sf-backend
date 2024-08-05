package com.radness.sf.material;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaterialService {

    private final MaterialRepository materialRepository;

    String factoryId = "1000";

    public Optional<Material> getMaterial(String materialId) throws AccountNotFoundException {
//        String factoryId = SfUtils.getFactoryId();
        return materialRepository.findById(new MaterialId(factoryId, materialId));
    }

    public List<Material> getMaterial() {
        return materialRepository.findAll();
    }

    public void addMaterial(Material material) {
        Optional<Material> byId = materialRepository.findById(new MaterialId(material.getId().getFactoryCode(), material.getId().getMaterialId()));
        if (byId.isPresent()) {
            throw new RuntimeException("Material already exists");
        }
        materialRepository.save(material);
    }

    public void deleteMaterial(Material material) {
        Optional<Material> byId = materialRepository.findById(new MaterialId(material.getId().getFactoryCode(), material.getId().getMaterialId()));
        if (byId.isEmpty()) {
            throw new RuntimeException("Material does not exist");
        }
        materialRepository.deleteById(new MaterialId(material.getId().getFactoryCode(), material.getId().getMaterialId()));
    }
}

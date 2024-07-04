package com.radness.sf.material;

import com.radness.sf.util.SfUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaterialService {

    private MaterialRepository materialRepository;

    public Optional<Material> getMaterial(String materialId) throws AccountNotFoundException {
        String factoryCode = SfUtils.getFactoryCode();
        return materialRepository.findById(new MaterialId("factoryCode1", materialId));
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

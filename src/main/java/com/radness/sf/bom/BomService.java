package com.radness.sf.bom;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BomService {

    private final BomRepository bomRepository;

    public List<Bom> getBomList(String materialId) {
        return bomRepository.findByMaterialId(materialId);
    }
}

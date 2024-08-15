package com.radness.sf.bom;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BomRepository extends JpaRepository<Bom, BomPK> {

    List<Bom> findByMaterialId(String materialId);

}


package com.radness.sf.material;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.radness.sf.material.QMaterial.material;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MaterialServiceTest {

    @Autowired EntityManager em;
    JPAQueryFactory queryFactory;

    @BeforeEach
    @DisplayName("테스트 실행 전 데이터 삽입")
    public void before() {
        queryFactory = new JPAQueryFactory(em);
        Material materialA = new Material();
        materialA.setFactoryId("1000");
        materialA.setMaterialId("mat_001");
        materialA.setMaterialType(MaterialType.valueOf("ROH"));
        materialA.setIsDeleted(false);
        materialA.setQty(100);
        Material materialB = new Material();
        materialB.setFactoryId("1000");
        materialB.setMaterialId("mat_002");
        materialB.setMaterialType(MaterialType.valueOf("ROH"));
        materialB.setIsDeleted(false);
        materialB.setQty(100);
        em.persist(materialA);
        em.persist(materialB);
    }

    @Test
    @DisplayName("Querydsl 테스트")
    void startQuerydsl() {
        Material findMaterial = queryFactory
                .select(material)
                .from(material)
                .where(
                        material.factoryId.eq("1000"),
                        material.materialId.eq("mat_001")
                )
                .fetchOne();
    }
}

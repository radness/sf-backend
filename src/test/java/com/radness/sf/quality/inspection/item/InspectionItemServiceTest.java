package com.radness.sf.quality.inspection.item;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Transactional
class InspectionItemServiceTest {

    @Autowired InspectionItemService service;
    @Autowired InspectionItemRepository repository;

    @Test
    @DisplayName("검사 항목 조회")
    public void getInspectionItem() {
        InspectionItem inspectionItem = new InspectionItem();
        inspectionItem.setInspectionItemCode(1L);
        inspectionItem.setInspectionItemDescription("검사 항목 001");

        InspectionItem inspItem = service.create(inspectionItem);

        InspectionItem findInspItem = service.get(inspItem.getInspectionItemCode());
//        findInspItem.ifPresent(item -> {
//            assertThat(inspItem.getInspectionItemCode()).isEqualTo(item.getInspectionItemCode());
//        });
        assertThat(inspItem.getInspectionItemCode()).isEqualTo(findInspItem.getInspectionItemCode());

    }
}
package com.radness.sf.quality.inspection.request;

import com.radness.sf.quality.inspection.InspectionType;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Transactional
class InspectionRequestServiceTest {

    @Autowired InspectionRequestService inspectionRequestService;
    @Autowired InspectionRequestRepository inspectionRequestRepository;

    @Test
    @DisplayName("검사 요청 조회")
    void getInspectionRequest() {
        // given
        InspectionRequest inspReq = new InspectionRequest();
        inspReq.setInspectionId(1L);
        inspReq.setInspectionDescription("테스트 검사 요청 001");
        inspReq.setInspectionType(InspectionType.IQC);
//        inspReq.setDeliveryQty(100);
//        inspReq.setInspectionRequestQty(100);
//        inspReq.setJudgmentQty(100);
//        inspReq.setDeliverySeq(1);
//        inspReq.setPurchaseOrderSeq(1);

        // when
        InspectionRequest newInspReq = inspectionRequestService.create(inspReq);

        // then
        Optional<InspectionRequest> inspectionRequest = inspectionRequestService.getInspectionRequest(newInspReq.getInspectionId());
        inspectionRequest.ifPresent(request -> Assertions.assertThat(request.getInspectionId()).isEqualTo(inspectionRequest.get().getInspectionId()));
    }
}

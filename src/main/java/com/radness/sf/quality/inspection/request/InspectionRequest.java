package com.radness.sf.quality.inspection.request;

import com.radness.sf.quality.inspection.InspectionType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "inspection_request")
public class InspectionRequest {

    @Id
    private String inspectionId;

    private String inspectionDescription;

    @Enumerated(EnumType.STRING)
    private InspectionType inspectionType;

    private String deliveryNumber;

    private int deliverySeq;

    private String materialId;

    private String materialDescription;

    private double deliveryQty;

    private Date inspecionRequestDate;

    private String purchaseOrderNumber;

    private int purchaseOrderSeq;

    private String vendorId;

    private String vendorDescription;

    private String inspectionStatus;

    private String inspectionStatusDescription;

    private String inspectionUserId;

    private double inspectionRequestQty;

    private String judgmentResultCode;

    private String judgeUserId;

    private String judgmentDate;

    private double judgmentQty;
}

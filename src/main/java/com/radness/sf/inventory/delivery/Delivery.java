package com.radness.sf.inventory.delivery;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@Data
public class Delivery {
    private String id;
    @Schema(name = "납품서 번호")
    private String deliveryNumber;
    @Schema(name = "구매 발주 번호")
    private String purchaseOrderNumber;
    @Schema(name = "납품서 순번")
    private int purchaseOrderSeq;
    @Schema(name = "납품 예정 일자", example = "2024-01-01")
    @Temporal(TemporalType.DATE)
    private Date expectedDeliveryDate;
    @Schema(name = "고객사 ID")
    private String vendorId;
    @Schema(name = "고객사명")
    private String vendorDescription;
    @Schema(name = "구매검수 완료 유무", defaultValue = "false")
    private boolean isPurchaseInspectionCompleted;
    @Schema(name = "구매검수 사용자 ID")
    private String purchaseInspectionUserId;
    @Schema(name = "납품 예정 일자", example = "2024-01-01 08:00:00:000")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseInspectionDateTime;
    @Schema(name = "구매검수 일자", example = "2024-01-01")
    @Temporal(TemporalType.DATE)
    private Date purchaseInspectionDate;
    @Schema(name = "생성자 ID")
    private String createUserId;
    @Schema(name = "생성 일시")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Schema(name = "수정자 ID")
    private String updateUserId;
    @Schema(name = "수정 일시")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

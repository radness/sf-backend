package com.radness.sf.inventory.delivery.detail;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "delivery_details")
@Tag(name = "납품서 상세")
public class DeliveryDetail {
    @Id
    private String id;
    @Schema(name = "납품서 순번")
    private int deliverySeq;
    @Schema(name = "자재/제품 ID")
    private String materialId;
    @Schema(name = "자재/제품명")
    private String materialDescription;
    @Schema(name = "구매발주 번호")
    private String purchaseOrderNumber;
    @Schema(name = "구매발주 순번")
    private int purchaseOrderSeq;
    @Schema(name = "납품 수량")
    private double deliveryQty;
    @Schema(name = "수입검사 번호")
    private String iqcNumber;
    @Schema(name = "수입검사 요청 일시")
    @Temporal(TemporalType.TIMESTAMP)
    private Date iqcRequestDateTime;
    @Schema(name = "수입검사 사용자 ID")
    private String iqcRequestUserId;
    @Schema(name = "수입검사 일시")
    private Date iqcDateTime;
    @Schema(name = "수입검사 상태")
    private String iqcStatus;
    @Schema(name = "수입검사 결과 코드")
    private String iqcResultCode;
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

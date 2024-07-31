package com.radness.sf.wip.lot.rework;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "wip_lot_rework")
public class WipLotRework {

    @Id
    private String factoryId;

    private String wipLotId;

    private int seq;

    private String transactionId;

    private String transactionUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDateTime;

    private String transactionComments;

    private String materialId;

    private String lineId;

    private String routingId;

    private String operationId;

    private String equipmentId;

    private String reworkCode;

    private String reworkStatus;

    private String reworkType;

    private boolean isReworkCompleted;

    private int reworkCompletedHistorySeq;

    private int reworkCount;

    private String reworkReturnRoutingId;

    private String reworkReturnOperationId;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

package com.radness.sf.wip.lot.history;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wip_lot_history")
public class WipLotHistory {

    @Id
    private WipLotHistoryId id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDateTime;

    private String transactionId;

    private String transactionSeq;

    private String transactionCode;

    private String transactionAccountId;

    private String lotStatus;

    private String materialId;

    private double qty;

    private String unit;

    private String orderId;

    private String lotDescription;

    @Temporal(TemporalType.TIMESTAMP)
    private Date factoryInDateTime;

    private String routingId;

    private int routingSeq;

    @Temporal(TemporalType.TIMESTAMP)
    private Date routingInDateTime;

    private String operationId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date processInDateTime;

    private boolean isHold;

    private String holdCode;

    private double processInQty;

    private double createQty;

    private double startQty;

    private boolean isInventory;

    private boolean isRework;

    private String reworkCode;

    private int reworkCount;

    private String reworkReturnRoutingId;

    private String reworkReturnOperationId;

    private Date reworkStartDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reworkEndDateTime;

    private boolean isRepair;

    private boolean isStart;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateTime;

    private boolean isEnd;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDateTime;

    private boolean isSample;

    private boolean isSplit;

    private String originalLotId;

    private boolean isShip;

    @Temporal(TemporalType.TIMESTAMP)
    private Date shipDateTime;

    private String batchId;

    private int batchSeq;

    private String bomId;

    private double goodQty;

    private double defectQty;

    private double changeQty;

    private boolean isDeleted;

    private String deleteCode;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDateTime;

    private String deleteAccount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateAccount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

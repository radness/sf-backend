package com.radness.sf.wip.lot;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "wip_lot")
public class WipLot {

    @Id
    private String wipLotId;

    private String factoryId;

    private String lotType;

    @Enumerated(EnumType.STRING)
    private WIpLotStatus lotStatus;

    private String materialId;

    private double qty;

    private String unit;

    private String orderId;

    private String locationId;

    private String areaId;

    private String zoneId;

    private String batchId;

    private String lineId;

    private String routingId;

    private String processId;

    private String equipmentId;

    private boolean isStart;

    private double startQty;

    private String startEquipmentId;

    private boolean isEnd;

    private double endQty;

    private String endEquipmentId;

    private boolean isProductionComplete;

    private boolean isDelete;

    private String deleteCode;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDateTime;

    private boolean isHold;

    private String holdId;

    private boolean isRework;

    private String reworkId;

    private int reworkCount;

    private Date reworkDateTime;

    private boolean isDefect;

    private String lastTransactionId;

    private String lastTransactionUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastTransactionDateTime;

    private String lastTransactionComments;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

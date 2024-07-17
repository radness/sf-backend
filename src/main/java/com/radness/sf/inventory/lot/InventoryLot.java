package com.radness.sf.inventory.lot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryLot {
    @Id
    private String invLotId;

    private String factoryId;

    private String invLotDescription;

    private String invLotType;

    private String invLotStatus;

    private String materialId;

    private double qty;

    private String unit;

    private String orderId;

    @Temporal(TemporalType.DATE)
    private Date recevingDate;

    private double recevingQty;

    private String vendorId;

    private String vendorLotId;

    private String areaId;

    private String zoneId;

    private String locationId;

    private String lineId;

    private String routingId;

    private String equipmentId;

    private String wipLotId;

    private String reasonId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date factoryInDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date operationInDateTime;

    private String shippingOrderId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ShippingDateTime;

    private boolean isHold;

    private String holdId;

    private boolean isSample;

    private double sampleQty;

    private String sampleInvLotId;

    private boolean isInspection;

    private String inspectionId;

    private String inspectionResultCode;

    private String transactionId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDateTime;

    private String originalInvLotId;

    private String changeStatusCode;

    private String changeInvLotId;

    private double isDeleted;

    private String deleteId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

    private String updateUserId;

}
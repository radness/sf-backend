package com.radness.sf.inventory.shipment;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shipment")
public class Shipment {
    @Id
    private String shipmentOrderId;
    private String factoryId;
    private String customerId;
    private String shipmentType;
    @Temporal(TemporalType.DATE)
    private Date shippingDate;
    @Temporal(TemporalType.DATE)
    private Date plannedShipmentDate;
    private double shipmentPlanQty;
    private double shipmentQty;
    private String shipmentStatus;
    private String shipmentAddress;
    private String shipmentComments;
    private boolean isDeleted;
    private String deleteUserId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDateTime;
    private String createUserId;
    private String createDateTime;
    private String updateUserId;
    private String updateDateTime;
}

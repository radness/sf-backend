package com.radness.sf.inventory.lot.forwarding.history;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Tag(name = "Inv Lot 출고 이력")
@Table(name = "inventory_lot_forwarding_history")
public class InventoryLotForwardingHistory {

    @Id
    private String invLotId;

    private String factoryId;

    private int seq;

    private String transactionId;

    private String transactionUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDateTime;

    private String transactionComments;

    private String materialId;

    private String lineId;

    private String processId;

    private String reasonCode;

    private double qty;

    private String wipLotId;

    private String shippingOrderId;

    private boolean isDeleted;
}

package com.radness.sf.wip.lot.split;

import lombok.Data;

@Data
public class SplitWipLot {

    private String wipLotId;

    private double qty;

    private String orderId;

    private String materialId;

    private String lineId;

    private String routingId;

    private String equipmentId;

    private String transactionCode;

    private String comments;
}

package com.radness.sf.wip.lot.move;

import lombok.Data;

@Data
public class WipLotMove {
    private String wipLotId;

    private String factoryId;

    private String currentOperationId;

    private String nextOperationId;

    private String materialId;

    private String orderId;

    private String lineId;

    private String routingId;

    private String equipmentId;

    private String areaId;

    private String zoneId;

    private String locationId;

}

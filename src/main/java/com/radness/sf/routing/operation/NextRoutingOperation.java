package com.radness.sf.routing.operation;

import com.radness.sf.wip.lot.rework.WipLotRework;
import lombok.Data;

@Data
public class NextRoutingOperation {

    private String routingId;

    private String operationId;

    private boolean isReworkReturn;

    private WipLotRework rework;
}

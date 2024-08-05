package com.radness.sf.routing.operation;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoutingOperationPk implements Serializable {
    private String factoryId;
    private String routingId;
    private String operationId;
}

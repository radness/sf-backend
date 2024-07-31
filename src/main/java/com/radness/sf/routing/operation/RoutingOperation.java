package com.radness.sf.routing.operation;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "routing_operation")
public class RoutingOperation {

    @Id
    @Column(name = "factory_id")
    private String factoryId;

    @Id
    @Column(name = "routing_id")
    private String routingId;

    @Id
    @Column(name = "opreation_id")
    private String operationId;

    private int seq;

    private String previousOperationId;

    private String nextOperationId;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

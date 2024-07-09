package com.radness.sf.order;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    private String orderId;

    private String factoryCode;

    private String orderDescription;

    private OrderStatus orderStatus;

    private int orderPriority;

    private String orderDate;

    private String materialId;

    private double qty;

    private double inputQty;

    private double outputQty;

    private double goodQty;

    private double lossQty;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderStartTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderEndTime;

    private String orderComments;

    private String productOrderId;

    
}

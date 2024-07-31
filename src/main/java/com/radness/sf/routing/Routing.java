package com.radness.sf.routing;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "routings")
public class Routing {

    @Id
    private String routingId;

    private String factoryId;

    private String routingDescription;

    private String firstRoutingId;

    private String lastRoutingId;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

package com.radness.sf.operation;

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
@Table(name = "operations")
@Tag(name = "공정")
public class Operation {

    @Id
    private String operationId;

    private String factoryId;

    private String operationDescription;

    @Enumerated(EnumType.STRING)
    private OperationType operationType;

    private String unit;

    private boolean isAuthorized;

    private boolean isStore;

    private boolean isPull;

    private String erpOperationId;

    private boolean isShipped;

    private boolean isIqc;

    private String locationId;

    private String areaId;

    private String zoneId;

    private boolean isDeleted;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDateTime;

    private String deleteUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

    private String updateUserId;
}

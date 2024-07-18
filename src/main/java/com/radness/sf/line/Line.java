package com.radness.sf.line;

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
@Table(name = "lines")
@Tag(name = "라인")
public class Line {

    @Id
    private String lineId;

    private String factoryId;

    private String lineDescription;

    @Enumerated(EnumType.STRING)
    private LineType lineType;

    private String areaId;

    private String zoneId;

    private String erpLineId;

    private String operationId;

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

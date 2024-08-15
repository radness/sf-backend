package com.radness.sf.bom;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "boms")
public class Bom {

    @Id
    private String factoryId;

    @Id
    private String materialId;

    @Id
    private String partId;

    private String partDescription;

    private int seq;

    private double qty;

    private String unit;

    @Temporal(TemporalType.DATE)
    private Date effectiveStartDate;

    @Temporal(TemporalType.DATE)
    private Date effectiveEndDate;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

}

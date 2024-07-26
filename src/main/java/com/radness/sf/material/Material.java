package com.radness.sf.material;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "materials")
public class Material {

    @EmbeddedId
    private MaterialId id;

    private String materialName;

    private String materialDescription;

    @Enumerated(EnumType.STRING)
    private MaterialType materialType;

    private double qty;

    private String unit;

    private String vendorId;

    private String customerId;

    private boolean isDeleted;

    private String deleteUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDateTime;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

package com.radness.sf.material;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(MaterialPK.class)
@Table(name = "materials")
public class Material {

    @Id
    @Value("${sf.entry.factoryId}")
    @Column(name = "factory_id")
    private String factoryId;

    @Id
    @Column(name = "material_id")
    private String materialId;

    private String materialName;

    private String materialDescription;

    @Enumerated(EnumType.STRING)
    private MaterialType materialType;

    private double qty;

    private String unit;

    private String vendorId;

    private String customerId;

    @Column(columnDefinition = "boolean default false")
    private Boolean isDeleted;

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

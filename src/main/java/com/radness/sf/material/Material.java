package com.radness.sf.material;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

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

    private String materialType;

    private double qty;

    private String unit;

    private String vendorId;

    private String customerId;
}

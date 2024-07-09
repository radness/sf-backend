package com.radness.sf.material;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialId implements Serializable {

    @Value("${sf.entry.factoryId}")
    @Column(name = "factory_code")
    private String factoryCode;

    @Column(name = "material_id")
    private String materialId;
}

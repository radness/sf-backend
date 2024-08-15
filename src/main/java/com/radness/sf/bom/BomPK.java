package com.radness.sf.bom;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.util.Date;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class BomPK implements Serializable {

    @Value("${sf.entry.factoryId}")
    @Column(name = "factory_id")
    private String factoryId;

    @Column(name = "material_id")
    private String materialId;

    @Column(name = "part_id")
    private String partId;

    @Column(name = "effective_start_date")
    @Temporal(TemporalType.DATE)
    private Date effectiveStartDate;

}

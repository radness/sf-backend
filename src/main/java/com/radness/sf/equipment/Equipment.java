package com.radness.sf.equipment;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Tag(name = "설비")
@Table(name = "equipments")
public class Equipment {

    @Id
    private String equipmentId;

    private String equipmentName;

    private String equipmentType;

    private String equipmentGroup;

    private String areaId;

    private String zoneId;

    private String locationId;

    private boolean isDeleted;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

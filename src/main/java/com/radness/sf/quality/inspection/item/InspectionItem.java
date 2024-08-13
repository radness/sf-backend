package com.radness.sf.quality.inspection.item;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "inspection_items")
public class InspectionItem {

    private Long inspectionItemCode;

    private String inspectionItemDescription;

//    private String createUserId;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createDateTime;
//
//    private String updateUserId;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updateDateTime;
}

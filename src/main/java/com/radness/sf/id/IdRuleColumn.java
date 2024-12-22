package com.radness.sf.id;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Tag(name = "ID 규칙 컬럼")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "id_rule_column")
public class IdRuleColumn {
    @Schema(name = "컬럼 이름")
    @Id
    private String columnName;
    @Schema(name = "컬럼 유형")
    private String columnType;
    @Schema(name = "컬럼 설명")
    private String columnDescription;
    @Schema(name = "컬럼 길이")
    private int columnLength;
    @Schema(name = "생성자 ID")
    private String createUserId;
    @Schema(name = "생성 시간")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Schema(name = "수정자 ID")
    private String updateUserId;
    @Schema(name = "수정 시간")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

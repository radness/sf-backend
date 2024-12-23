package com.radness.sf.code.table;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Tag(name = "공통 코드 테이블")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "code_tables")
@IdClass(CodeTablePK.class)
public class CodeTable {
    @Id
    @Column(name = "factory_id")
    private String factoryId;
    @Id
    @Column(name = "table_name")
    private String tableName;
    @Id
    @Column(name = "first_primary_key")
    private String firstPrimaryKey;
    @Id
    @Column(name = "second_primary_key")
    private String secondPrimaryKey;
    @Id
    @Column(name = "third_primary_key")
    private String thirdPrimaryKey;
    private String primaryKeyDescription;
    private String firstColumn;
    private String secondColumn;
    private String thirdColumn;
    private String fourthColumn;
    private String fifthColumn;
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

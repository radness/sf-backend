package com.radness.sf.code.table;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Tag(name = "공통 코드 테이블")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "code_tables")
public class CodeTable {
    @Id
    @Schema(name = "테이블 ID")
    @Column(name = "table_id", nullable = false, length = 30, unique = true)
    private String tableId;
    @Schema(name = "테이블명")
    private String tableDescription;
    private String firstKey;
    private String firstKeyType;
    @ColumnDefault("0")
    private int firstKeyLength;
    private String firstKeyCodeTable;
    private String secondKey;
    private String secondKeyType;
    @ColumnDefault("0")
    private int secondKeyLength;
    private String secondKeyCodeTable;
    private String thirdKey;
    private String thirdKeyType;
    @ColumnDefault("0")
    private int thirdKeyLength;
    private String thirdKeyCodeTable;
    private String firstColumn;
    private String firstColumnType;
    @ColumnDefault("0")
    private int firstColumnLength;
    private String firstColumnCodeTable;
    private String secondColumn;
    private String secondColumnType;
    @ColumnDefault("0")
    private int secondColumnLength;
    private String secondColumnCodeTable;
    private String thirdColumn;
    private String thirdColumnType;
    @ColumnDefault("0")
    private int thirdColumnLength;
    private String thirdColumnCodeTable;
    private String fourthColumn;
    private String fourthColumnType;
    @ColumnDefault("0")
    private int fourthColumnLength;
    private String fourthColumnCodeTable;
    private String fifthColumn;
    private String fifthColumnType;
    @ColumnDefault("0")
    private int fifthColumnLength;
    private String fifthColumnCodeTable;
    @Schema(name = "생성자 ID")
    private String createUserId;
    @Schema(name = "생성 시간")
    @CreationTimestamp(source = SourceType.DB)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Schema(name = "수정자 ID")
    private String updateUserId;
    @Schema(name = "수정 시간")
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}

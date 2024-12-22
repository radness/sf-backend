package com.radness.sf.id;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@Tag(name = "ID 규칙")
@Data
public class IdRule {
    @Schema(name = "규칙 ID")
    private String ruleId;
    @Schema(name = "규칙 유형")
    private String ruleType;
    @Schema(name = "규칙 설명")
    private String ruleDescription;
    @Schema(name = "트랜잭션 유형")
    private String transactionType;
    private String firstColumnName;
    private String firstColumnType;
    private String secondColumnName;
    private String secondColumnType;
    private String thirdColumnName;
    private String thirdColumnType;
    private String fourthColumnName;
    private String fourthColumnType;
    private String fifthColumnName;
    private String fifthColumnType;
    private String sixthColumnName;
    private String sixthColumnType;
    private String seventhColumnName;
    private String seventhColumnType;
    private String eighthColumnName;
    private String eighthColumnType;
    private String ninthColumnName;
    private String ninthColumnType;
    private String tenthColumnName;
    private String tenthColumnType;
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

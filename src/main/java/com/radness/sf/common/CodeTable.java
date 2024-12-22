package com.radness.sf.common;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@Data
public class CodeTable {
    private String factoryCode;
    private String table;
    private String firstPrimaryKey;
    private String secondPrimaryKey;
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

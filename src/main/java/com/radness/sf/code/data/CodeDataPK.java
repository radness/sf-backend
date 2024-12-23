package com.radness.sf.code.data;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CodeDataPK implements Serializable {
    @Column(name = "factory_id")
    private String factoryId;
    @Column(name = "table_name")
    private String tableName;
    @Column(name = "first_primary_key")
    private String firstPrimaryKey;
    @Column(name = "second_primary_key")
    private String secondPrimaryKey;
    @Column(name = "third_primary_key")
    private String thirdPrimaryKey;
}

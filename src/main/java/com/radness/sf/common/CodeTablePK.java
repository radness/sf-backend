package com.radness.sf.common;

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
public class CodeTablePK implements Serializable {
    @Value("${sf.entry.factoryId}")
    @Column(name = "factory_id")
    private String factoryId;
    @Column(name = "table")
    private String table;
    @Column(name = "first_primary_key")
    private String firstPrimaryKey;
    @Column(name = "second_primary_key")
    private String secondPrimaryKey;
    @Column(name = "third_primary_key")
    private String thirdPrimaryKey;
}

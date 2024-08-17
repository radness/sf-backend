package com.radness.sf.alarm;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class AlarmPK implements Serializable {

    @Column(name = "factory_id")
    private String factoryId;

    @Column(name = "alarm_id")
    private String alarmId;

}

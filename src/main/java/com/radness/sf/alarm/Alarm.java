package com.radness.sf.alarm;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(AlarmPK.class)
@Table(name = "alarms")
public class Alarm {

    @Id
    private String factoryId;

    @Id
    private String alarmId;

    private String alarmDescription;

    private String alarmLevel;

    private boolean isEnabled;

    private boolean isEmail;

    private boolean isMobile;

    private String createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    private String updateUserId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

}

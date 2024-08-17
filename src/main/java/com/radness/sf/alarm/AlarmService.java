package com.radness.sf.alarm;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlarmService {

    private final AlarmRepository alarmRepository;


    public Optional<Alarm> getAlarm(String alarmId) {
        AlarmPK alarmPK = new AlarmPK();
        alarmPK.setFactoryId("${sf.alarm.factoryId}");
        alarmPK.setAlarmId(alarmId);
        return alarmRepository.findById(alarmPK);
    }
}

package com.radness.sf.alarm;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/alarms")
public class AlarmController {

    private final AlarmService alarmService;

    @GetMapping("/{alarmId}")
    public Optional<Alarm> getAlarm(@PathVariable String alarmId) {
        return alarmService.getAlarm(alarmId);
    }
}

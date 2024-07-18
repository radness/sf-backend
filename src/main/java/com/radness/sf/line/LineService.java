package com.radness.sf.line;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly=true)
@RequiredArgsConstructor
public class LineService {

    private final LineRepository lineRepository;

    public Optional<Line> getLine(String lineId) {
        return lineRepository.findById(lineId);
    }

    public void saveLine(Line line) {
        lineRepository.save(line);
    }

    public void deleteLine(String lineId) {
        lineRepository.deleteById(lineId);
    }
}

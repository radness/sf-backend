package com.radness.sf.line;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/lines")
public class LineController {

    private final LineService lineService;

    @GetMapping("/{lineId}")
    public Optional<Line> viewLine(@PathVariable String lineId) {
        return lineService.getLine(lineId);
    }

    @PostMapping
    public void newLine(@RequestBody Line line) {
        lineService.saveLine(line);
    }

    @DeleteMapping("/{lineId}")
    public void deleteLine(@PathVariable String lineId) {
        lineService.deleteLine(lineId);
    }
}

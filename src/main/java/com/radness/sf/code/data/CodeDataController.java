package com.radness.sf.code.data;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Tag(name = "코드 데이터")
@RestController
@RequestMapping("/v3/codeData")
@RequiredArgsConstructor
public class CodeDataController {

    private final CodeDataService codeDataService;

    @GetMapping("/{id}")
    public Optional<CodeData> getCodeData(@PathVariable String id) {
        return codeDataService.getCodeData(id);
    }

    @GetMapping()
    public List<CodeData> getAllCodeData(CodeData codeData) {
        return codeDataService.getAllCodeData(codeData);
    }

}

package com.radness.sf.code.table;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "코드 테이블")
@RestController
@RequestMapping("/v3/codeTables")
@RequiredArgsConstructor
public class CodeTableController {

    private final CodeTableService codeTableService;

    @Schema(name = "코드 테이블 조회")
    @GetMapping("/{id}")
    public Optional<CodeTable> getCodeTable(@PathVariable String id) {
        return codeTableService.getCodeTable(id);
    }

    @Schema(name = "코드 테이블 목록 조회")
    @GetMapping()
    public List<CodeTable> getAllCodeTables() {
        return codeTableService.getAllCodeTables();
    }

    @Schema(name = "코드 테이블 저장")
    @PostMapping("/{id}")
    public CodeTable createCodeTable(@PathVariable String id, @RequestBody CodeTable codeTable) {
        return codeTableService.createCodeTable(id ,codeTable);
    }

    @Schema(name = "코드 테이블 목록 저장")
    @PostMapping()
    public List<CodeTable> createCodeTables(@RequestBody List<CodeTable> codeTables) {
        return codeTableService.createCodeTables(codeTables);
    }

    @Schema(name = "코드 테이블 삭제")
    @DeleteMapping("/{id}")
    public void deleteCodeTable(@PathVariable String id) {
       codeTableService.deleteCodeTable(id);
    }

    @Schema(name = "코드 테이블 목록 삭제")
    @DeleteMapping()
    public void deleteCodeTables(@RequestBody List<CodeTable> codeTables) {
        codeTableService.deleteCodeTables(codeTables);
    }
}

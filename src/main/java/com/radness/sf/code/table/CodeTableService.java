package com.radness.sf.code.table;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CodeTableService {

    private final CodeTableRepository codeTableRepository;

    public Optional<CodeTable> getCodeTable(String id) {
        return codeTableRepository.findById(id);
    }

    public List<CodeTable> getAllCodeTables() {
        return codeTableRepository.findAll();
    }

    public CodeTable createCodeTable(String id, CodeTable codeTable) {
        return codeTableRepository.save(codeTable);
    }

    public List<CodeTable> createCodeTables(List<CodeTable> codeTables) {
        return codeTableRepository.saveAll(codeTables);
    }

    public void deleteCodeTable(String id) {
        codeTableRepository.deleteById(id);
    }

    public void deleteCodeTables(List<CodeTable> ids) {
        codeTableRepository.deleteAll(ids);
    }
}

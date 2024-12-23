package com.radness.sf.code.data;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CodeDataService {

    private final CodeDataRepository codeDataRepository;

    public Optional<CodeData> getCodeData(String id) {
        return codeDataRepository.findById(id);
    }

    public List<CodeData> getAllCodeData(CodeData codeData) {
        return codeDataRepository.findAllById(Collections.singleton(codeData.getTableName()));
    }
}

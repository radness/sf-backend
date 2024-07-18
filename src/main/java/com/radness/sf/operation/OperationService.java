package com.radness.sf.operation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly=true)
@RequiredArgsConstructor
public class OperationService {

    private final OperationRepository operationRepository;

    public Optional<Operation> getOperation(String operationId) {
        return operationRepository.findById(operationId);
    }

    public Operation addOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    public void deleteOperation(String operationId) {
        operationRepository.deleteById(operationId);
    }
}

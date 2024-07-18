package com.radness.sf.operation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v3/operations")
@RequiredArgsConstructor
public class OperationController {

    private final OperationService operationService;

    @GetMapping("/{operationId}")
    public Optional<Operation> viewOperation(@PathVariable("operationId") String operationId) {
        return operationService.getOperation(operationId);
    }

    @PostMapping()
    public Operation newOperation(@RequestBody Operation operation) {
        return operationService.addOperation(operation);
    }

    @DeleteMapping("/operationId")
    public void deleteOperation(@PathVariable("operationId") String operationId) {
        operationService.deleteOperation(operationId);
    }
}

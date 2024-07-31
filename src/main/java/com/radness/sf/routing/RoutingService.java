package com.radness.sf.routing;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class RoutingService {

    private final RoutingRepository routingRepository;

    public Optional<Routing> getRouting(String routingId) {
        return routingRepository.findById(routingId);
    }

    public Routing createRouting(Routing routing) {
        return routingRepository.save(routing);
    }

    public Routing updateRouting(String routingId, Routing routing) {
        return routingRepository.save(routing);
    }

    public void deleteRouting(String routingId) {
        routingRepository.deleteById(routingId);
    }

}

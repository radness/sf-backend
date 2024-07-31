package com.radness.sf.routing;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/routings")
public class RoutingController {

    private final RoutingService routingService;

    @GetMapping("/{routingId}")
    public Optional<Routing> getRouting(@PathVariable String routingId) {
        return routingService.getRouting(routingId);
    }

    @PostMapping("/{routingId}")
    public Routing createRouting(Routing routing) {
        return routingService.createRouting(routing);
    }

    @PutMapping("/{routingId}")
    public Routing updateRouting(@PathVariable String routingId, Routing routing) {
        return routingService.updateRouting(routingId, routing);
    }

    @DeleteMapping("/{routingId}")
    public void deleteRouting(@PathVariable String routingId) {
        routingService.deleteRouting(routingId);
    }
}

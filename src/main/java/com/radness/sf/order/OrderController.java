package com.radness.sf.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v3/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/{orderId}")
    public Optional<Order> getOrder(@PathVariable("orderId") String orderId) {
        return orderService.getOrder(orderId);
    }

    @PostMapping()
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(@PathVariable("orderId") String orderId, @RequestBody Order order) {
        return orderService.updateOrder(orderId, order);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable("orderId") String orderId) {
        orderService.deleteOrder(orderId);
    }

    @GetMapping()
    public List<Order> getOrders(Order order) {
        return orderService.getOrders(order);
    }

    @PostMapping("/create")
    public void createOrders(@RequestBody List<Order> orders) {
        orderService.createOrders(orders);
    }

    @PostMapping("/save")
    public void saveOrders(@RequestBody List<Order> orders) {
        orderService.saveOrders(orders);
    }

    @DeleteMapping()
    public void deleteOrders(@RequestBody List<Order> orders) {
        orderService.deleteOrders(orders);
    }

    @PostMapping("/confirm")
    public void confirmOrders(@RequestBody List<Order> orders) {
        orderService.confirmOrders(orders);
    }

    @PostMapping("/cancel")
    public void cancelOrders(@RequestBody List<Order> orders) {
        orderService.cancelOrders(orders);
    }

    @PostMapping("/process")
    public void processOrders(@RequestBody List<Order> orders) {
        orderService.processOrders(orders);
    }

    @PostMapping("/wait")
    public void waitOrders(@RequestBody List<Order> orders) {
        orderService.waitOrders(orders);
    }

    @PostMapping("/end")
    public void endOrders(@RequestBody List<Order> orders) {
        orderService.endOrders(orders);
    }

}

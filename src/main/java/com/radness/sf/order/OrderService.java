package com.radness.sf.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Optional<Order> getOrder(String orderId) {
        return orderRepository.findById(orderId);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }

    public Order updateOrder(String orderId, Order order) {
        return null;
    }

    public List<Order> getOrders(Order order) {
        return null;
    }

    public void createOrders(List<Order> orders) {
    }

    public void saveOrders(List<Order> orders) {

    }

    public void deleteOrders(List<Order> orders) {

    }

    public void confirmOrders(List<Order> orders) {

    }

    public void cancelOrders(List<Order> orders) {

    }

    public void processOrders(List<Order> orders) {

    }

    public void waitOrders(List<Order> orders) {

    }

    public void endOrders(List<Order> orders) {

    }


}

package com.example.order_service;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    List<String> orders = new ArrayList<>();

    @PostMapping
    public String createOrder(@RequestBody String order) {
        orders.add(order);
        return "Order Created: " + order;
    }

    @GetMapping
    public List<String> getOrders() {
        return orders;
    }
}
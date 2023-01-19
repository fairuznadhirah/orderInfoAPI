package com.accenture.orderInfo.controller;

import brave.Tracer;
import com.accenture.orderInfo.entity.Order;
import com.accenture.orderInfo.repository.OrderRepository;
import com.accenture.orderInfo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class OrderController {

    private final OrderRepository orderRepo;

//    Tracer tracer;

    @Autowired
    OrderService orderService;

    public OrderController(OrderRepository orderRepo){
        this.orderRepo = orderRepo;
//        this.tracer = tracer;
    }

    @GetMapping("/test/{id}")
    public List<Order> getOrder(){
        return orderService.getOrders();
    }

    @PostMapping("/test/add")
    public Order createOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable(value = "id") long id){
        orderService.deleteOrder(id);
    }
}

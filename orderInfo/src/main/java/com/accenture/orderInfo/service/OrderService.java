package com.accenture.orderInfo.service;

import com.accenture.orderInfo.entity.Order;
//import com.accenture.orderInfo.exceptions.OrderException;
import com.accenture.orderInfo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepo;

    RestTemplate restTemplate = new RestTemplate();

    public Order addOrder(Order order){
        return orderRepo.save(order);
    }

    public List<Order> getOrders(){
        return orderRepo.findAll();
    }

    public void deleteOrder(long id){
//        orderRepo.findById(id).orElseThrow(
//                () -> new OrderException("Order does no exist..")
//        );
        orderRepo.deleteById(id);
    }
    public Order updateOrder(Order order){
//        orderRepo.findById(order.getId()).orElseThrow(
//                () -> new OrderException("Order with id= " + order.getId() + " does not exist")
//        );
        return orderRepo.save(order);
    }
}

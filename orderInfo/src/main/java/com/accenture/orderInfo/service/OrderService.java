package com.accenture.orderInfo.service;

import com.accenture.orderInfo.entity.Order;
import com.accenture.orderInfo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepo;

    public Order addOrder(Order order){
        return orderRepo.save(order);
    }

    public List<Order> getOrders(){
        return orderRepo.findAll();
    }

    public void deleteOrder(long id){
        orderRepo.deleteById(id);
    }
    public Order updateOrder(Order order){
        return orderRepo.save(order);
    }
}

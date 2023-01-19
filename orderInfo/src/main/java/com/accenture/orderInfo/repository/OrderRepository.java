package com.accenture.orderInfo.repository;

import com.accenture.orderInfo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

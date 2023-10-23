package com.example.app.SpringBootWebFruitShop.repository;

import com.example.app.SpringBootWebFruitShop.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}

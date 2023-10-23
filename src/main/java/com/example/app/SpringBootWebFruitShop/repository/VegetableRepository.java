package com.example.app.SpringBootWebFruitShop.repository;

import com.example.app.SpringBootWebFruitShop.entity.Vegetable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VegetableRepository extends CrudRepository<Vegetable, Long> {

}

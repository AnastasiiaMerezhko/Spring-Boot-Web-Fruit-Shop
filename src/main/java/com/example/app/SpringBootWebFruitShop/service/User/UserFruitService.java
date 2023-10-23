package com.example.app.SpringBootWebFruitShop.service.User;

import com.example.app.SpringBootWebFruitShop.entity.Fruit;
import com.example.app.SpringBootWebFruitShop.repository.FruitRepository;
import com.example.app.SpringBootWebFruitShop.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class UserFruitService {

    @Autowired
    FruitRepository repository;

    public List<Fruit> getAll() {
        Iterable<Fruit> iterable = repository.findAll();
        List<Fruit> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(fruit -> new Fruit(fruit.getId(),
                                Constants.BASE_URL +
                                        Constants.URL_IMAGES_UPLOADS + fruit.getImg(),
                                fruit.getName(),
                                fruit.getArticle(),
                                fruit.getDescr(),
                                fruit.getPrice()))
                        .toList();
        return new ArrayList<>(list);
    }
}

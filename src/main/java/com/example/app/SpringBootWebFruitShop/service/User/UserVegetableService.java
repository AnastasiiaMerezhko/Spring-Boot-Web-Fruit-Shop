package com.example.app.SpringBootWebFruitShop.service.User;

import com.example.app.SpringBootWebFruitShop.entity.Vegetable;
import com.example.app.SpringBootWebFruitShop.repository.VegetableRepository;
import com.example.app.SpringBootWebFruitShop.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class UserVegetableService {

    @Autowired
    VegetableRepository repository;

    public List<Vegetable> getAll() {
        Iterable<Vegetable> iterable = repository.findAll();
        List<Vegetable> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(vegetable -> new Vegetable(vegetable.getId(),
                                Constants.BASE_URL +
                                        Constants.URL_IMAGES_UPLOADS + vegetable.getImg(),
                                vegetable.getName(),
                                vegetable.getArticle(),
                                vegetable.getDescr(),
                                vegetable.getPrice()))
                        .toList();
        return new ArrayList<>(list);
    }
}

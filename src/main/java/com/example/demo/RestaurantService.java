package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repo;

    public List<Restaurant> getAllRestaurants() {
        return repo.findAll();
    }
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin(origins = "http://localhost:3000") // allows frontend access
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping
    public List<Restaurant> getAll() {
        return service.getAllRestaurants();
    }
}

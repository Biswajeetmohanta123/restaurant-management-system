package com.example.RestaurantManagement.service;

import com.example.RestaurantManagement.model.Food;
import com.example.RestaurantManagement.repository.IFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    IFoodRepository iFoodRepository;

    public List<Food> showFood() {
       return iFoodRepository.findAll();
    }
}

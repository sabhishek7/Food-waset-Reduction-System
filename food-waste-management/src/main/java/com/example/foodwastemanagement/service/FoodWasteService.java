package com.example.foodwastemanagement.service;

import com.example.foodwastemanagement.model.FoodWaste;
import com.example.foodwastemanagement.repository.FoodWasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodWasteService {
    @Autowired
    private FoodWasteRepository repository;

    public List<FoodWaste> getAllFoodWaste() {
        return repository.findAll();
    }

    public FoodWaste saveFoodWaste(FoodWaste foodWaste) {
        return repository.save(foodWaste);
    }

    public void deleteFoodWaste(Long id) {
        repository.deleteById(id);
    }
}
package com.healthfriend.backend.controller;

import com.healthfriend.backend.entity.Nutrition;
import com.healthfriend.backend.repository.NutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api/nutrition")
public class NutritionController {
    @Autowired
    private NutritionRepository nutritionRepository;


    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Nutrition> getAllCustomer() {
        return nutritionRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Nutrition getCustomerById(@PathVariable("id") int id) {
        return nutritionRepository.findById(id).get();
    }

    @PutMapping(path = "/update")
    public @ResponseBody String updateCustomer(@RequestBody Nutrition input) {
        nutritionRepository.save(input);
        return "Saved";
    }

    @PostMapping(path = "/add")
    public @ResponseBody Long addNewCustomer(@RequestBody Nutrition input) {
        Nutrition result = nutritionRepository.save(input);
        return result.getId();
    }

    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteCustomer(@PathVariable("id") int id) {
        nutritionRepository.deleteById(id);
        return "Deleted";
    }
}

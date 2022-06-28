package com.healthfriend.backend.controller;

import com.healthfriend.backend.entity.Water;
import com.healthfriend.backend.repository.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping(path = "/api/water")
public class WaterController {
    @Autowired
    private WaterRepository waterRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Water> getAllWater() {

        return waterRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Water getWaterById(@PathVariable("id") int id) {
        return waterRepository.findById(id).get();
    }

    @PutMapping(path = "/update")
    public @ResponseBody String updateWater(@RequestBody Water input) {
        waterRepository.save(input);
        return "Saved";
    }

    @PostMapping(path = "/add")
    public Water save(@RequestBody Water water){
        return waterRepository.save(water);
    }
    /**public @ResponseBody Long addNewWater(@RequestBody Water input) {
     Water result = waterRepository.save(input);
     return result.getId();
     }*/


}
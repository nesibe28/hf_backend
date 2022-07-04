package com.healthfriend.backend.controller;

import com.healthfriend.backend.entity.Nutrition;
import com.healthfriend.backend.entity.Survey;
import com.healthfriend.backend.repository.NutritionRepository;
import com.healthfriend.backend.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api/survey")
public class SurveyController {
    @Autowired
    private SurveyRepository surveyRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Survey> getAllNutrition() {
        return surveyRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Survey getNutritionById(@PathVariable("id") int id) {
        return surveyRepository.findById(id).get();
    }

    @PutMapping(path = "/update")
    public @ResponseBody String updateNutrition(@RequestBody Survey input) {
        surveyRepository.save(input);
        return "Saved";
    }

    @PostMapping(path = "/add")
    public @ResponseBody String addNewNutrition(@RequestBody Survey input) {
        surveyRepository.save(input);
        return "Saved";
    }

    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteNutrition(@PathVariable("id") int id) {
        surveyRepository.deleteById(id);
        return "Deleted";
    }
}

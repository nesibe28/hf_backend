package com.healthfriend.backend.controller;

import com.healthfriend.backend.entity.CalendarEvent;
import com.healthfriend.backend.repository.CalendarEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api/calendar")
public class CalendarEventController {
    @Autowired
    private CalendarEventRepository calendarRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<CalendarEvent> getAllNutrition() {
        return calendarRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody CalendarEvent getCalendarEventById(@PathVariable("id") int id) {
        return calendarRepository.findById(id).get();
    }

    @PutMapping(path = "/update")
    public @ResponseBody String updateCalendarEvent(@RequestBody CalendarEvent input) {
        calendarRepository.save(input);
        return "Saved";
    }

    @PostMapping(path = "/add")
    public @ResponseBody CalendarEvent addNewCalendarEvent(@RequestBody CalendarEvent input) {
        return calendarRepository.save(input);
    }

    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteCalendarEvent(@PathVariable("id") int id) {
        calendarRepository.deleteById(id);
        return "Deleted";
    }
}

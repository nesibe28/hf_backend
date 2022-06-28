package com.healthfriend.backend.repository;

import com.healthfriend.backend.entity.Calendar;
import org.springframework.data.repository.CrudRepository;

public interface CalendarRepository extends CrudRepository<Calendar, Integer> {
}

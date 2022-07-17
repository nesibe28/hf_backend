package com.healthfriend.backend.repository;

import com.healthfriend.backend.entity.CalendarEvent;
import org.springframework.data.repository.CrudRepository;

public interface CalendarEventRepository extends CrudRepository<CalendarEvent, Integer> {
}

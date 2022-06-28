package com.healthfriend.backend.repository;

import com.healthfriend.backend.entity.Survey;
import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<Survey, Integer> {
}

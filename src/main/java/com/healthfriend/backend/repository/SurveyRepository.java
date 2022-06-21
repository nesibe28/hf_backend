package com.healthfriend.backend.repository;

import com.healthfriend.backend.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {
}

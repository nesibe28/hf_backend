package com.healthfriend.backend.repository;

import com.healthfriend.backend.entity.Nutrition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionRepository extends JpaRepository<Nutrition, Integer> {
}

package com.healthfriend.backend.repository;

import com.healthfriend.backend.entity.Nutrition;
import org.springframework.data.repository.CrudRepository;

public interface NutritionRepository extends CrudRepository<Nutrition, Integer> {
}

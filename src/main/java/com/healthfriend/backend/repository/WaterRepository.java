package com.healthfriend.backend.repository;

import com.healthfriend.backend.entity.Water;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterRepository extends JpaRepository<Water, Integer> {
}

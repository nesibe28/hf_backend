package com.healthfriend.backend.entity;

import com.healthfriend.backend.dto.Meal;
import com.healthfriend.backend.dto.Medicine;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Nutrition {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Type(type="json")
    private List<Meal> meals;

    @Type(type="json")
    private List<Medicine> medicines;
}

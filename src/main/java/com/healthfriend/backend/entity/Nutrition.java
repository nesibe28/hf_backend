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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }
}

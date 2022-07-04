package com.healthfriend.backend.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
public class Nutrition {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private boolean mealEatenMorning;

    private boolean mealEatenAfternoon;

    private boolean mealEatenEvening;

    private boolean medicineTakenMorning;

    private boolean medicineTakenAfternoon;

    private boolean medicineTakenEvening;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isMealEatenMorning() {
        return mealEatenMorning;
    }

    public void setMealEatenMorning(boolean mealEatenMorning) {
        this.mealEatenMorning = mealEatenMorning;
    }

    public boolean isMealEatenAfternoon() {
        return mealEatenAfternoon;
    }

    public void setMealEatenAfternoon(boolean mealEatenAfternoon) {
        this.mealEatenAfternoon = mealEatenAfternoon;
    }

    public boolean isMealEatenEvening() {
        return mealEatenEvening;
    }

    public void setMealEatenEvening(boolean mealEatenEvening) {
        this.mealEatenEvening = mealEatenEvening;
    }

    public boolean isMedicineTakenMorning() {
        return medicineTakenMorning;
    }

    public void setMedicineTakenMorning(boolean medicineTakenMorning) {
        this.medicineTakenMorning = medicineTakenMorning;
    }

    public boolean isMedicineTakenAfternoon() {
        return medicineTakenAfternoon;
    }

    public void setMedicineTakenAfternoon(boolean medicineTakenAfternoon) {
        this.medicineTakenAfternoon = medicineTakenAfternoon;
    }

    public boolean isMedicineTakenEvening() {
        return medicineTakenEvening;
    }

    public void setMedicineTakenEvening(boolean medicineTakenEvening) {
        this.medicineTakenEvening = medicineTakenEvening;
    }
}

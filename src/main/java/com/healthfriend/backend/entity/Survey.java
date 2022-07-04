package com.healthfriend.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Survey {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private String sickness;

    private int glassesOfWater;

    private int mealsPerDay;

    private String activityInMorning;

    private String medicineInMorning;

    private String activityInAfternoon;

    private String medicineInAfternoon;

    private String activityInEvening;

    private String medicineInEvening;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGlassesOfWater() {
        return glassesOfWater;
    }

    public void setGlassesOfWater(int glassesOfWater) {
        this.glassesOfWater = glassesOfWater;
    }

    public int getMealsPerDay() {
        return mealsPerDay;
    }

    public void setMealsPerDay(int mealsPerDay) {
        this.mealsPerDay = mealsPerDay;
    }

    public String getActivityInMorning() {
        return activityInMorning;
    }

    public void setActivityInMorning(String activityInMorning) {
        this.activityInMorning = activityInMorning;
    }

    public String getMedicineInMorning() {
        return medicineInMorning;
    }

    public void setMedicineInMorning(String medicineInMorning) {
        this.medicineInMorning = medicineInMorning;
    }

    public String getActivityInAfternoon() {
        return activityInAfternoon;
    }

    public void setActivityInAfternoon(String activityInAfternoon) {
        this.activityInAfternoon = activityInAfternoon;
    }

    public String getMedicineInAfternoon() {
        return medicineInAfternoon;
    }

    public void setMedicineInAfternoon(String medicineInAfternoon) {
        this.medicineInAfternoon = medicineInAfternoon;
    }

    public String getActivityInEvening() {
        return activityInEvening;
    }

    public void setActivityInEvening(String activityInEvening) {
        this.activityInEvening = activityInEvening;
    }

    public String getMedicineInEvening() {
        return medicineInEvening;
    }

    public void setMedicineInEvening(String medicineInEvening) {
        this.medicineInEvening = medicineInEvening;
    }
}

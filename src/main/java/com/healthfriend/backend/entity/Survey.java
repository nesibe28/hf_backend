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

    private String Sickness;

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
        return Sickness;
    }

    public void setSickness(String sickness) {
        Sickness = sickness;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

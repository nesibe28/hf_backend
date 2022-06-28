package com.healthfriend.backend.dto;

import com.healthfriend.backend.enums.MealTimes;

public class Medicine {
    private String medicineName;

    private MealTimes time;

    private boolean eaten;

    public MealTimes getTime() {
        return time;
    }

    public void setTime(MealTimes time) {
        this.time = time;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }
}

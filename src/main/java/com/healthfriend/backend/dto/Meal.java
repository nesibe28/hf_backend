package com.healthfriend.backend.dto;

import com.healthfriend.backend.enums.MealTimes;

public class Meal {
    private MealTimes mealtime;

    private boolean eaten;

    public MealTimes getMealtime() {
        return mealtime;
    }

    public void setMealtime(MealTimes mealtime) {
        this.mealtime = mealtime;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }
}

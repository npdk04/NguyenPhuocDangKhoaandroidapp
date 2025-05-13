package com.tranduythanh.utils;

public class BMI {
    private double BMI;
    private String description;

    public BMI() {
    }

    public BMI(double BMI, String description) {
        this.BMI = BMI;
        this.description = description;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

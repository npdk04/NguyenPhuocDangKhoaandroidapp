package com.tranduythanh.utils;

public class HealthCare {
    public static BMI calculate_bmi(double height, double weight)
    {
        double BMI = weight/Math.pow(height,2);
        String des="";
        if (BMI<18.5){
            des="gầy trơ xương";
        }
        else if(BMI<23) {
            des="Bình thường";
        }
        else {des = "beso"
            ;
        }
        BMI bmiStatus = new BMI(BMI,des);
                return bmiStatus;
    }
}

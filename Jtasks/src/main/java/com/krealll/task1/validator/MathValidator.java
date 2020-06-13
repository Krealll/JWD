package com.krealll.task1.validator;

public class MathValidator {
    public static final int ARTIFICIAL_CONSTRAINT=1000;

    public boolean validateNum(double number){
        return number<ARTIFICIAL_CONSTRAINT;
    }

    public boolean isPositive(double number){
        return number>0;
    }

    public boolean isPositive(int number){
        return number>0;
    }

}

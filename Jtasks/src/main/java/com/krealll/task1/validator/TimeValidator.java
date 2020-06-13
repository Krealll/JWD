package com.krealll.task1.validator;

public class TimeValidator {
    public static final int SECONDS_IN_DAY=86400;
    public static final int MONTH_IN_YEAR=12;
    public static final int AD_ERA_BEGINNING=0;

    public boolean isOkDaySeconds(int seconds){
        return seconds>0&&seconds<SECONDS_IN_DAY;
    }

    public boolean isOkYear(int year){
        return year>AD_ERA_BEGINNING;
    }

    public boolean isOkMonth(int month){
        return month>=1&&month<=MONTH_IN_YEAR;
    }

}

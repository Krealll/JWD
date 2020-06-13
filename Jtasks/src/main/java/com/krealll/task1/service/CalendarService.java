package com.krealll.task1.service;

import com.krealll.task1.entity.Response;
import com.krealll.task1.validator.TimeValidator;

import java.time.LocalDate;

public class CalendarService {
    
    public static final int LEAP_YEAR_CONSTANT_400 = 400;
    public static final int LEAP_YEAR_CONSTANT_100 = 100;
    public static final int LEAP_YEAR_CONSTANT_4 = 4;

    public Response<Integer> checkMonth(int  monthVal){
        TimeValidator timeValidator = new TimeValidator();
        return timeValidator.isOkMonth(monthVal)
                ?new Response<>(monthVal,Response.ResponseStatus.OK)
                :new Response<>(Response.ResponseStatus.VALIDATE_ERR);
    }

    public Response<Integer> checkYear(int yearVal){
        TimeValidator timeValidator = new TimeValidator();
        return timeValidator.isOkYear(yearVal)
                ?new Response<>(yearVal,Response.ResponseStatus.OK)
                :new Response<>(Response.ResponseStatus.VALIDATE_ERR);
    }

    public boolean isLeap(int year){
        if(year%LEAP_YEAR_CONSTANT_400==0){
            return true;
        }
        else if (year%LEAP_YEAR_CONSTANT_100==0){
            return true;
        }
        else {
            return year % LEAP_YEAR_CONSTANT_4 == 0;
        }
    }

    public Response<Integer> countNumberOfDays(int month, int year){
        LocalDate localDate = LocalDate.of(year,month,1);
        return new Response<>(localDate.lengthOfMonth(), Response.ResponseStatus.OK);
    }

}

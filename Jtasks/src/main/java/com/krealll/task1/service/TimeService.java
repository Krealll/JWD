package com.krealll.task1.service;

import com.krealll.task1.entity.Day;
import com.krealll.task1.entity.Response;
import com.krealll.task1.exception.ParseException;
import com.krealll.task1.validator.TimeValidator;

public class TimeService {
    private static final int SECONDS_IN_HOUR=3600;
    private static final int SECONDS_IN_MINUTE=60;

    public Response<Integer> checkSeconds(int secondsVal) {
        TimeValidator timeValidator = new TimeValidator();
        return timeValidator.isOkDaySeconds(secondsVal)
                ? new Response<>(secondsVal, Response.ResponseStatus.OK)
                : new Response<>(Response.ResponseStatus.VALIDATE_ERR);
    }

    public Response<Day> countDayTime(int seconds){
        Day day = new Day();
        day.setHour(seconds/SECONDS_IN_HOUR);
        day.setMinute((seconds%SECONDS_IN_HOUR)/SECONDS_IN_MINUTE);
        day.setSecond(((seconds%SECONDS_IN_HOUR)%SECONDS_IN_MINUTE));
        return new Response<>(day, Response.ResponseStatus.OK);
    }

}

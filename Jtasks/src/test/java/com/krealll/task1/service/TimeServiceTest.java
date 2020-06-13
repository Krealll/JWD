package com.krealll.task1.service;

import com.krealll.task1.entity.Day;
import com.krealll.task1.entity.Response;
import com.krealll.task1.exception.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeServiceTest {

    TimeService timeService;

    @BeforeMethod
    public void setUp() {
        timeService = new TimeService();
    }

    @Test
    public void CheckSecondsPosTest(){
        Response<Integer> actual = timeService.checkSeconds(10),
                expected= new Response<Integer>(10, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckSecondsNEgTest() {
        Response<Integer> actual = timeService.checkSeconds(86401),
                expected= new Response<>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }

    @Test
    public void CountDayTime() {
        Response<Day> actual = timeService.countDayTime(8000);
        Response<Day> expected= new Response<Day>(new Day(2,13,20), Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }
}
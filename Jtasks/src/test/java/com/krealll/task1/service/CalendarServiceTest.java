package com.krealll.task1.service;

import com.krealll.task1.entity.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarServiceTest {

    CalendarService calendarService;

    @BeforeMethod
    public void setUp() {
        calendarService  = new CalendarService();
    }

    @Test
    public void CheckMonthPosTest() {
        Response<Integer> actual = calendarService.checkMonth(2),
                expected= new Response<Integer>(2, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckMonthNegTest() {
        Response<Integer> actual = calendarService.checkMonth(20),
                expected= new Response<Integer>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckYearPosTest() {
        Response<Integer> actual = calendarService.checkYear(2000),
                expected= new Response<Integer>(2000, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckYearNegTest() {
        Response<Integer> actual = calendarService.checkYear(-300),
                expected= new Response<Integer>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }

    @Test
    public void IsLeapPosTest() {
        boolean actual = calendarService.isLeap(2000);
        assertTrue(actual);
    }

    @Test
    public void IsLeapNegTest() {
        boolean actual = calendarService.isLeap(1999);
        assertFalse(actual);
    }

    @Test
    public void CountNumberOfDaysPosTest() {
        Response<Integer> actual = calendarService.countNumberOfDays(1,2000),
                expected= new Response<Integer>(31, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CountNumberOfDaysNegTest() {
        Response<Integer> actual = calendarService.countNumberOfDays(2,2000),
                expected= new Response<Integer>(28, Response.ResponseStatus.OK);
        assertNotEquals(actual, expected);
    }
}
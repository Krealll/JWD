package com.krealll.task1.validator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeValidatorTest {

    TimeValidator timeValidator;

    @BeforeMethod
    public void setUp() {
        timeValidator = new TimeValidator();
    }

    @Test
    public void IsOkDaySecondsPosTest() {
        assertTrue(timeValidator.isOkDaySeconds(86399));
    }

    @Test
    public void IsOkDaySecondsNegTest() {
        assertFalse(timeValidator.isOkDaySeconds(-1));
    }

    @Test
    public void testIsOkYearPosTest() {
        assertTrue(timeValidator.isOkYear(1));
    }

    @Test
    public void testIsOkYearNegTest() {
        assertFalse(timeValidator.isOkYear(-1));
    }

    @Test
    public void testIsOkMonthPosTest() {
        assertTrue(timeValidator.isOkMonth(11));
    }

    @Test
    public void testIsOkMonthNegTest() {
        assertFalse(timeValidator.isOkMonth(13));
    }
}
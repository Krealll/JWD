package com.krealll.task1.validator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathValidatorTest {

    MathValidator mathValidator;
    @BeforeMethod
    public void setUp() {
        mathValidator = new MathValidator();
    }

    @Test
    public void validateNumPosTest() {
        assertTrue(mathValidator.validateNum(1.122));
    }

    @Test
    public void validateNumNegTest() {
        assertFalse(mathValidator.validateNum(1001.1));
    }

    @Test
    public void IsPositiveIntPosTest() {
        assertTrue(mathValidator.isPositive(3));
    }

    @Test
    public void IsPositiveIntNegTest() {
        assertFalse(mathValidator.isPositive(-1));
    }

    @Test
    public void IsPositiveDoublePosTest() {
        assertTrue(mathValidator.isPositive(55.9452));
    }

    @Test
    public void IsPositiveDoubleNegTest() {
        assertFalse(mathValidator.isPositive(-0.0001));
    }
}
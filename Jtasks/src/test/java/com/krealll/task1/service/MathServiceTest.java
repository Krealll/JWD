package com.krealll.task1.service;

import com.krealll.task1.entity.Response;
import com.krealll.task1.validator.MathValidator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathServiceTest {

    MathService mathService;

    @BeforeMethod
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void CheckNumberPosTest() {
        Response<Integer> actual = mathService.checkNumber(999),
                expected= new Response<Integer>(999, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckNumberNegTest() {
        Response<Integer> actual = mathService.checkNumber(-22),
                expected= new Response<Integer>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }

    @Test
    public void CalcLastDigitOfSquareTest() {
        Response<Integer> actual = mathService.calcLastDigitOfSquare(99),
                expected= new Response<Integer>(1, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }


}
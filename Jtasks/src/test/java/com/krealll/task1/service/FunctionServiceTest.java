package com.krealll.task1.service;

import com.krealll.task1.entity.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class FunctionServiceTest {

    private static final double DOUBLE_DELTA = 0.00001;

    FunctionService functionService;

    @BeforeMethod
    public void setUp() {
        functionService = new FunctionService();
    }

    @Test
    public void CheckNumberPosTest() {
        Response<Double> actual = functionService.checkNumber(2.0),
                expected= new Response<Double>(2.0, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckNumberNegTest() {
        Response<Double> actual = functionService.checkNumber(2000.12),
                expected= new Response<>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }

    @Test(description = "x<3")
    public void CalculateFunctionTest() {
        Response<Double> actual = functionService.calcFunction(1.0),
                expected= new Response<Double>(-0.2, Response.ResponseStatus.OK);
        assertEquals(actual.getResponse(), expected.getResponse(),DOUBLE_DELTA);
    }

    @Test(description = "x>=3")
    public void CalcFunctionTest() {
        Response<Double> actual = functionService.calcFunction(4.0),
                expected= new Response<Double>(5.0, Response.ResponseStatus.OK);
        assertEquals(actual.getResponse(), expected.getResponse(),DOUBLE_DELTA);
    }

    @Test
    public void CalcTangTableTest() {
        Map<Double, Double> expectedMap = new HashMap<>();
        expectedMap.put(-1.0, -1.5574077246549023);
        expectedMap.put(0.0, 0.0);
        expectedMap.put(1.0, 1.5574077246549023);
        expectedMap.put(2.0, -2.185039863261519);
        Response<Map<Double, Double>> actual = functionService.calcTangTable(-1.0, 2.0, 1.0);
        Response<Map<Double, Double>> expected = new Response<>(expectedMap, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }
}
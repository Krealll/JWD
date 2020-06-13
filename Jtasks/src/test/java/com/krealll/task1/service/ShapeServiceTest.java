package com.krealll.task1.service;

import com.krealll.task1.entity.Point;
import com.krealll.task1.entity.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShapeServiceTest {

    private static final double DOUBLE_DELTA = 0.00001;

    ShapeService shapeService;

    @BeforeMethod
    public void setUp() {
        shapeService = new ShapeService();
    }

    @Test
    public void CheckAreaPosTest() {
        Response<Double> actual = shapeService.checkArea(1.2),
                expected= new Response<Double>(1.2, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckAreaNegTest() {
        Response<Double> actual = shapeService.checkArea(-1.0),
                expected= new Response<>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckRadiusPosTest() {
        Response<Double> actual = shapeService.checkRadius(20.2),
                expected= new Response<Double>(20.2, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckRadiusNegTest() {
        Response<Double> actual = shapeService.checkRadius(-10.1),
                expected= new Response<>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }


    @Test
    public void CalcCircleArea() {
        Response<Double> actual = shapeService.calcCircleArea(4.0),
                expected= new Response<Double>(50.2654824574, Response.ResponseStatus.OK);
        assertEquals(actual.getResponse(), expected.getResponse(),DOUBLE_DELTA);
    }

    @Test
    public void CalcCircleLength() {
        Response<Double> actual = shapeService.calcCircleLength(4.0),
                expected= new Response<Double>(25.1327412287, Response.ResponseStatus.OK);
        assertEquals(actual.getResponse(), expected.getResponse(),DOUBLE_DELTA);
    }

    @Test
    public void CalcSquareArea() {
        Response<Double> actual = shapeService.calcSquareArea(4.0),
                expected= new Response<Double>(16.0, Response.ResponseStatus.OK);
        assertEquals(actual.getResponse(), expected.getResponse(),DOUBLE_DELTA);
    }

    @Test
    public void CalcInscribedSquareArea() {
        Response<Double> actual = shapeService.calcInscribedSquareArea(4.0),
                expected= new Response<Double>(2.0, Response.ResponseStatus.OK);
        assertEquals(actual.getResponse(), expected.getResponse(),DOUBLE_DELTA);
    }

    @Test
    public void CalcTimesBigger() {
        Response<Double> actual = shapeService.calcTimesBigger(16.0,
                    shapeService.calcInscribedSquareArea(16.0).getResponse()),
                expected= new Response<Double>(2.0, Response.ResponseStatus.OK);
        assertEquals(actual.getResponse(), expected.getResponse(),DOUBLE_DELTA);
    }
}
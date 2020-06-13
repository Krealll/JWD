package com.krealll.task1.service;

import com.krealll.task1.entity.Point;
import com.krealll.task1.entity.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {

    PointService pointService;

    @BeforeMethod
    public void setUp() {
        pointService = new PointService();
    }

    @Test
    public void CheckPointPosTest() {
        Response<Point> actual = pointService.checkPoint(new Point(1,2)),
                expected= new Response<Point>(new Point(1,2), Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckPointNegTest() {
        Response<Point> actual = pointService.checkPoint(new Point(1009,2)),
                expected= new Response<>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }

    @Test
    public void CompDistTest() {
        int actual = pointService.compDist(new Point(0,1), new Point(3,2)),
                expected= 1;
        assertEquals(actual, expected);
    }

    @Test
    public void CompDistTestEquals() {
        int actual = pointService.compDist(new Point(2,2), new Point(2,2)),
                expected= 0;
        assertEquals(actual, expected);
    }
}
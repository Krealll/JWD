package com.krealll.task1.service;

import com.krealll.task1.entity.Response;

public class ShapeService {
    private static final int MINIMUM_AREA=0;
    private static final int MINIMUM_RADIUS=0;

    public Response<Double> checkArea(double areaVal) {
        return areaVal>=MINIMUM_AREA
                ? new Response<>(areaVal, Response.ResponseStatus.OK)
                : new Response<>(Response.ResponseStatus.VALIDATE_ERR);
    }

    public Response<Double> checkRadius(double radiusVal) {
        return radiusVal>=MINIMUM_RADIUS
                ? new Response<>(radiusVal, Response.ResponseStatus.OK)
                : new Response<>(Response.ResponseStatus.VALIDATE_ERR);
    }

    public Response<Double> calcCircleArea(double radius) {
        double result = Math.PI*radius*radius;
        return new Response<>(result, Response.ResponseStatus.OK);
    }

    public Response<Double> calcCircleLength(double radius) {
        double result = Math.PI*radius*2;
        return new Response<>(result, Response.ResponseStatus.OK);
    }

    public Response<Double> calcSquareArea(double line) {
        double result = line*line;
        return new Response<>(result, Response.ResponseStatus.OK);
    }

    public Response<Double> calcInscribedSquareArea(double inputArea) {
        double result = inputArea/2;
        return new Response<>(result, Response.ResponseStatus.OK);
    }

    public Response<Double> calcTimesBigger(double inputArea, double outputArea) {
        return new Response<>(inputArea/outputArea, Response.ResponseStatus.OK);
    }

}

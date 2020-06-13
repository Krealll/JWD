package com.krealll.task1.service;

import com.krealll.task1.entity.Point;
import com.krealll.task1.entity.Response;
import com.krealll.task1.validator.MathValidator;

public class PointService {

    public Response<Point> checkPoint(Point point) {
        MathValidator mathValidator = new MathValidator();
        if(mathValidator.validateNum(point.getxValue())){
            return new Response<>(point, Response.ResponseStatus.OK);
        }
        else {
            return new Response<>(Response.ResponseStatus.VALIDATE_ERR);
        }
    }

    public int compDist(Point first, Point second){
        double firstDist = Math.hypot(first.getxValue(),first.getyValue()),
                secondDist =  Math.hypot(second.getxValue(),second.getyValue());
        if(firstDist>secondDist){
            return -1;
        }
        else if(Double.compare(firstDist,secondDist)==0){
            return 0;
        }
        else {
            return 1;
        }
    }

}

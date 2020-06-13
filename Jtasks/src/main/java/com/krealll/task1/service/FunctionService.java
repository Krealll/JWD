package com.krealll.task1.service;

import com.krealll.task1.entity.Response;
import com.krealll.task1.validator.MathValidator;

import java.util.HashMap;
import java.util.Map;

public class FunctionService {

    public Response<Double> checkNumber(double numberVal) {
        MathValidator mathValidator = new MathValidator();
        if(mathValidator.validateNum(numberVal)) {
            return new Response<>(numberVal, Response.ResponseStatus.OK);
        }
        else {
            return new Response<>(Response.ResponseStatus.VALIDATE_ERR);
        }
    }

    public Response<Double> calcFunction(double x){
        double result;
        if(x<3){
            result= 1/(Math.pow(x,3)-6);
        }
        else {
            result= -Math.pow(x,2)+3*x+9;
        }
        return new Response<>(result, Response.ResponseStatus.OK);
    }

    public Response<Map<Double,Double>> calcTangTable(double a, double b, double h){
        Map<Double, Double> resultMap = new HashMap<>();
        double yVal;
        for( double xVal = a; xVal <=b; xVal+=h){
            yVal = Math.tan(xVal);
            resultMap.put(xVal,yVal);
        }
        return new Response<>(resultMap, Response.ResponseStatus.OK);
    }

}

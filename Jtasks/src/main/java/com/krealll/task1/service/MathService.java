package com.krealll.task1.service;

import com.krealll.task1.entity.Response;
import com.krealll.task1.validator.MathValidator;

public class MathService {

    public Response<Integer> checkNumber(int numberVal) {
        MathValidator mathValidator = new MathValidator();
        return mathValidator.isPositive(numberVal)
                ? new Response<>(numberVal, Response.ResponseStatus.OK)
                : new Response<>(Response.ResponseStatus.VALIDATE_ERR);
    }

    public Response<Integer> calcLastDigitOfSquare(int number) {
        int result = (int) (Math.pow(number, 2)) % 10;
        return new Response<>(result, Response.ResponseStatus.OK);
    }
}

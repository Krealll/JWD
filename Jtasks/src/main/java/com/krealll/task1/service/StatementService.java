package com.krealll.task1.service;

import com.krealll.task1.entity.Response;
import com.krealll.task1.validator.MathValidator;

import java.util.ArrayList;
import java.util.List;

public class StatementService {

    private static final int MINIMUM_AREA=0;

    private int countDividerNum(int number){
        int result=0,
            n=number,
            flag = 0;
        for(int i = 2; i < number; i++)
        {
            while (n % i == 0) {
                n/= i;
                flag =1;
            }
            n=number;
            if(flag==0)
                continue;
            result +=i;
            flag=0;
        }
        result++;
        return result;
    }

    private boolean isEven(int number){
        return number%2==0;
    }

    public Response<Integer> checkNumber(int numberVal) {
        MathValidator mathValidator = new MathValidator();
        return mathValidator.isPositive(numberVal)
                ? new Response<>(numberVal, Response.ResponseStatus.OK)
                : new Response<>(Response.ResponseStatus.VALIDATE_ERR);
    }

    public Response<List<Integer>> findEvenNumbers(int... statementVal){
            List<Integer> EvenList = new ArrayList<>();
            for (int i = 0; i <4 ; i++) {
                if(isEven(statementVal[i])){
                    EvenList.add(statementVal[i]);
                }
            }
            return new Response<>(EvenList, Response.ResponseStatus.OK);
    }

    public Response<Boolean> isTrueStatement(List<Integer> statementList){
        return statementList.size()>=2
                ?new Response<>(true, Response.ResponseStatus.OK)
                :new Response<>(false, Response.ResponseStatus.OK);
    }

    public Response<Boolean> isPrimeNumber(int number){
        return countDividerNum(number)==number
                ?new Response<>(true, Response.ResponseStatus.OK)
                :new Response<>(false, Response.ResponseStatus.OK);
    }

}

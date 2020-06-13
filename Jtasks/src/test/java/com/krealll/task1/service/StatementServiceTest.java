package com.krealll.task1.service;

import com.krealll.task1.entity.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class StatementServiceTest {

    StatementService statementService;

    @BeforeMethod
    public void setUp() {
        statementService = new StatementService();
    }

    @Test
    public void CheckNumberPosTest() {
        Response<Integer> actual = statementService.checkNumber(1),
                expected= new Response<Integer>(1, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void CheckNumberNegTest() {
        Response<Integer> actual = statementService.checkNumber(-1),
                expected= new Response<>(Response.ResponseStatus.VALIDATE_ERR);
        assertEquals(actual, expected);
    }

    @Test
    public void findEvenNumbersTest() {
        List<Integer> expectedList= new ArrayList<Integer>();
        expectedList.add(102);
        expectedList.add(100);
        Response<List<Integer>> actual = statementService.findEvenNumbers(102,100,33,31);
        Response<List<Integer>> expected = new Response<>(expectedList, Response.ResponseStatus.OK);
        assertEquals(actual,expected);
    }

    @Test
    public void IsTrueStatementPosTest() {
        List<Integer> actualList= statementService.findEvenNumbers(100,200,1,2).getResponse();
        Response<Boolean> actual = statementService.isTrueStatement(actualList),
                expected= new Response<Boolean>(true, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void IsTrueStatementNegTest() {
        List<Integer> actualList= statementService.findEvenNumbers(100,221,1,23).getResponse();
        Response<Boolean> actual = statementService.isTrueStatement(actualList),
                expected= new Response<Boolean>(false, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void IsPrimeNumberPosTest() {
        Response<Boolean> actual = statementService.isPrimeNumber(6),
                expected= new Response<Boolean>(true, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }

    @Test
    public void IsPrimeNumberNegTest() {
        Response<Boolean> actual = statementService.isPrimeNumber(200),
                expected= new Response<Boolean>(false, Response.ResponseStatus.OK);
        assertEquals(actual, expected);
    }
}
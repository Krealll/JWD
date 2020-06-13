package com.krealll.task1.parser;


import com.krealll.task1.entity.Point;
import com.krealll.task1.exception.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ParserTest {

    private static final double DOUBLE_DELTA = 0.00001;

    Parser parser;

    @BeforeMethod
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void toIntValuePosTest() {
        try {
            String testString = "10";
            int actual = parser.toIntValue(testString),
                expected = 10;
            assertEquals(actual,expected);
        }catch (ParseException e){
            fail();
        }
    }

    @Test(expectedExceptions = ParseException.class)
    public void toIntValueNegTest() throws ParseException {
        String testString = "qwerty";
        parser.toIntValue(testString);
    }

    @Test
    public void ToDoubleValuePosTest() {
        try {
            String testString = "113.1";
            double actual = parser.toDoubleValue(testString),
                    expected = 113.1;
            assertEquals(actual,expected,DOUBLE_DELTA);
        }catch (ParseException e){
            fail();
        }
    }

    @Test(expectedExceptions = ParseException.class)
    public void ToDoubleValueNegTest() throws ParseException {
        String testString = "2.2.";
        parser.toDoubleValue(testString);
    }

    @Test
    public void ToPointValuePosTest() {
        try {
            String testStringX= "3.11",
                    testStringY = "10.99";
            Point pointExpected = new Point(3.11, 10.99),
                    pointActual = new Point();
            double tempX = parser.toDoubleValue(testStringX),
                    tempY = parser.toDoubleValue(testStringY);
            pointActual.setxValue(tempX);
            pointActual.setyValue(tempY);
            assertEquals(pointActual,pointExpected);
        }catch (ParseException e){
            fail();
        }
    }

    @Test(expectedExceptions = ParseException.class)
    public void ToPointValueNegTest() throws ParseException {
        String testStringX= "2.a61",
                testStringY = "qq0.e93";
        parser.toPointValue(testStringX,testStringY);
    }
}
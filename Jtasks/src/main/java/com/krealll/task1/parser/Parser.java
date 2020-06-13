package com.krealll.task1.parser;

import com.krealll.task1.entity.Point;
import com.krealll.task1.exception.ParseException;

public class Parser {

    public int toIntValue(String value) throws ParseException{
        try{
            return Integer.parseInt(value);
        } catch (NumberFormatException e){
            throw new ParseException("String to int error");
        }
    }

    public double toDoubleValue(String value) throws ParseException{
        try{
            return Double.parseDouble(value);
        } catch (NumberFormatException e){
            throw new ParseException("String to double error");
        }
    }

    public Point toPointValue(String x, String y) throws ParseException{
        try{
            double xVal= toDoubleValue(x);
            double yVal= toDoubleValue(y);
            return new Point(xVal,yVal);
        } catch (NumberFormatException e){
            throw new ParseException("String to Point error");
        }
    }
}

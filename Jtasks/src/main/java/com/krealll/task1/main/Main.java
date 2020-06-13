package com.krealll.task1.main;

import com.krealll.task1.console.ConsoleManager;
import com.krealll.task1.exception.ParseException;
import com.krealll.task1.parser.Parser;
import com.krealll.task1.service.MathService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        //only Task 1 example:
        try {
            Scanner sc = new Scanner(System.in);
            Parser parser = new Parser();
            MathService mathService = new MathService();
            ConsoleManager consoleManager = new ConsoleManager();
            String value = String.valueOf(sc.next());
            int number = parser.toIntValue(value),
            result = mathService.calcLastDigitOfSquare(number).getResponse();
            consoleManager.printToConsole(String.format("number:%d, result:%d",number,result));
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }
    }
}

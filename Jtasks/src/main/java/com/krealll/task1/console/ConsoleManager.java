package com.krealll.task1.console;

import java.util.Map;

public class ConsoleManager {

    public void printToConsole(String string){
        System.out.printf(string);
    }

    public void printToConsole(boolean val){
        System.out.println(val);
    }

    public void printToConsole(int val){
        System.out.println(val);
    }

    public void printToConsole(double val){
        System.out.println(val);
    }

    public void printToConsole(Map<Double,Double> map){
        for(Map.Entry<Double,Double> entry:map.entrySet()){
            System.out.printf("%f - %f",entry.getKey(),entry.getValue());
        }
    }
}

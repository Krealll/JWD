package com.krealll.day2.task6;

public class Main {
    public static void main(String[] args) {
        DeadLineManager deadLineManager= new DeadLineManager();
        if(!(args.length>0&&args.length<3)){
            System.out.println("Incorrect arguments, input Surname as first param and number of days as second");
        }
        else {
            deadLineManager.calcDeadLine(args[0],args[1]);
        }
    }
}

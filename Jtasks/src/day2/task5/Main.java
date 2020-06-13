package com.krealll.day2.task5;

public class Main {
    public static void main(String[] args) {
        SumManager sumManager = new SumManager();
        if(!(args.length >0)){
            System.out.println("Incorrect arguments");
        }
        else {
            sumManager.calcSum(args);
        }
    }
}

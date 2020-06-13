package com.krealll.day2.task1;

public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello();
        if(args.length>0) {
            hello.greeting(args[0]);
        }
        else {
            System.out.println("Input arguments");
        }
    }
}

package com.krealll.day2.task2;

public class Task2Manager {

    public void showReverse(String[] args){
        if(args.length>0) {
            for (int i = args.length-1; i >= 0; i--) {
                System.out.printf("%s ",args[i]);
            }
        }
        else{
            System.out.println("Input arguments");
        }
    }
}

package com.krealll.day2.task3;

public class RandomManager {

    public void showRand(String arg,String arg2) {
        int num = Integer.parseInt(arg);
        if(!arg2.equals("NL")) {
            for (int i = 0; i <num ; i++) {
                System.out.printf("%d ",(int)(Math.random()*10));
            }
        }
        else {
            for (int i = 0; i <num ; i++) {
                System.out.println((int)(Math.random()*10));
            }
        }

    }
}

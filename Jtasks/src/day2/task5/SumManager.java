package com.krealll.day2.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumManager {

    private String regExName= "\\d";
    Pattern pattern = Pattern.compile(regExName);
    Matcher matcher;

    public void calcSum(String[] args) {
        int temp,sum=0;
        for (int i = 0; i <args.length ; i++) {
            matcher=pattern.matcher(args[i]);
            if(!matcher.matches()){
                System.out.println("Incorrect arguments");
                return;
            }
            temp=Integer.parseInt(args[i]);
            sum+=temp;
        }
        System.out.printf("sum is %d", sum);
    }
}

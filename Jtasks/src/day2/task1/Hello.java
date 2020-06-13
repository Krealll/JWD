package com.krealll.day2.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {

    private String regExName= "[A-Za-z]+";
    Pattern pattern = Pattern.compile(regExName);

    public void greeting(String name){
        Matcher matcher=pattern.matcher(name);
        if(!matcher.matches()){
            System.out.println("Enter your name to get greeting");
        }
        else {
            System.out.printf("Hello, %s",name);
        }
    }
}

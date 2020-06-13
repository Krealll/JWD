package com.krealll.day2.task4;

public class PasswordManager {
    private static final String password ="42Pass24";
    public void checkPassword(String arg) {
        if(arg.equals(password)){
            System.out.println("Inputted password is correct ");
        }
        else {
            System.out.println("Inputted password is not correct ");
        }
    }
}

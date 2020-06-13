package com.krealll.day2.task4;

public class Main {
    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager();
        if(args.length != 1){
            System.out.println("Incorrect arguments");
        }
        else {
            passwordManager.checkPassword(args[0]);
        }

    }
}

package com.krealll.day2.task7;

public class Main {
    public static void main(String[] args) {
        BirthdayManager birthdayManager= new BirthdayManager();
        if(!(args.length>0&&args.length<4)){
            System.out.println("Incorrect arguments, input day month year");
        }
        else {
            birthdayManager.manageBirthday(args[0],args[1],args[2]);
        }
    }
}

package com.krealll.day2.task6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DeadLineManager {
    public void calcDeadLine(String surname, String numberOfDays){
        try {
            int numberOfDaysVal = Integer.parseInt(numberOfDays);
            DateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, numberOfDaysVal);
            System.out.printf("Developer: %s. Deadline:", surname);
            System.out.println(dtf.format(calendar.getTime()));
        }catch (NumberFormatException e){
            System.out.println("Incorrect argument");
        }
    }
}

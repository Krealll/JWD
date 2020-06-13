package com.krealll.day2.task7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthdayManager {

    private String dateRegEx = "(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)";
    Pattern pattern = Pattern.compile(dateRegEx);
    Matcher matcher;

    public void manageBirthday(String arg, String arg1, String arg2) {
        System.out.println(arg+"."+arg1+"."+arg2);
        matcher=pattern.matcher(arg+"/"+arg1+"/"+arg2);
        if(!(matcher.matches())){
            System.out.println("Incorrect date");
        }
        else {
            int day = Integer.parseInt(arg),
                    month=Integer.parseInt(arg1),
                    year = Integer.parseInt(arg2),
                    dayOfWeek;
            Calendar calendar = new GregorianCalendar(year,month-1,day),
                    currentCalendar = Calendar.getInstance();
            dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            System.out.printf("Your birthday is on %d day of week", dayOfWeek);
            System.out.printf("Your age is %d",manageAge(currentCalendar,calendar));
        }
    }

    private int manageAge(Calendar currentCalendar, Calendar calendar) {
        int age = currentCalendar.get(Calendar.YEAR);
        age-=calendar.get(Calendar.YEAR);
        age--;

        if(isMonthBigger(currentCalendar,calendar)
                ||(isMonthEquals(currentCalendar,calendar)
                &&isDayBigger(currentCalendar,calendar))){
            age++;
            return age;
        }
        if(isDayEquals(calendar,currentCalendar)) {
            if(isMonthEquals(calendar,currentCalendar)){
                System.out.println("\nHappy birthday!");
                age++;
            }
        }
        return age;
    }


    private boolean isMonthBigger(Calendar first, Calendar second){
        return first.get(Calendar.MONTH)>second.get(Calendar.MONTH);
    }

    private boolean isMonthEquals(Calendar first, Calendar second){
        return first.get(Calendar.MONTH)==second.get(Calendar.MONTH);
    }

    private boolean isDayBigger(Calendar first, Calendar second){
        return first.get(Calendar.DAY_OF_MONTH)>second.get(Calendar.DAY_OF_MONTH);
    }

    private boolean isDayEquals(Calendar first, Calendar second){
        return first.get(Calendar.DAY_OF_MONTH)==second.get(Calendar.DAY_OF_MONTH);
    }
}

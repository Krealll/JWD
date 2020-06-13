package com.krealll.task1.entity;

public class Day {
    private int hour;
    private int minute;
    private int second;

    public Day(int hours, int minutes, int seconds) {
        this.hour=hours;
        this.minute=minutes;
        this.second=seconds;
    }

    public Day() {}

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return hour == day.hour &&
                minute == day.minute &&
                second == day.second;
    }

    @Override
    public int hashCode() {
        int result = hour;
        result=37*result+minute;
        result=37*result+second;
        return result;
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer("Day:{");
        string.append(hour).append(":");
        string.append(minute).append(":");
        string.append(second).append("}");
        return string.toString();
    }
}

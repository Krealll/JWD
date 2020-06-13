package com.krealll.task1.entity;

public class Point {
    private double xValue;
    private double yValue;

    public Point(double x, double y) {
        this.xValue=x;
        this.yValue=y;
    }

    public Point() {}

    public double getxValue() {
        return xValue;
    }

    public void setxValue(double xValue) {
        this.xValue = xValue;
    }

    public double getyValue() {
        return yValue;
    }

    public void setyValue(double yValue) {
        this.yValue = yValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.xValue, xValue) == 0 &&
                Double.compare(point.yValue, yValue) == 0;
    }

    @Override
    public int hashCode() {
        int result=17;
        long value;
        value=Double.doubleToLongBits(xValue);
        result=37*result+(int)(value-(value>>>32));
        value=Double.doubleToLongBits(yValue);
        result=37*result+(int)(value-(value>>>32));
        return result;
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer("Point:{");
        string.append("x: ").append(xValue);
        string.append(", y:").append(yValue).append("}");
        return string.toString();
    }
}

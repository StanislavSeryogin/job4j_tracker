package ru.job4j.condition;

import ru.job4j.first.Point;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public static boolean exist(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (exist(a, b, c)) {
            rsl =  Math.sqrt(p * (p - a)  * (p - b) * (p - c));
        }
        return rsl;
    }
}

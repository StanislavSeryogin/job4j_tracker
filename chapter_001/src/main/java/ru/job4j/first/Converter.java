package ru.job4j.first;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static double euroToRuble(double value) {
        return value * 70;
    }
    public static double dollarToRuble(double value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(70);
        System.out.println("70 rubles = " + euro + " euro.");
        int dollar = rubleToDollar(60);
        System.out.println("60 rubles = " + dollar + " dollar.");
        double ruble1 = euroToRuble(1);
        System.out.println("1 euro = " + ruble1 + " rubles");
        double ruble2 = dollarToRuble(1);
        System.out.println("1 dollar = " + ruble2 + " rubles\n");
    }

}

package ru.job4j.loop;

/**
 * Package for calculate task.
 *
 * @author StasSeryogin;
 * @version $5.8$
 * @since 2
 */

public class Calculater1 {
    public static void add(double first, double second) {
        double result = first / second;
        System.out.println(first + "+" + second + "=" + result);
    }
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }
    public static void main(String[] args) {
        add(1, 1);
        div(4, 4);
        multiply(2, 1);
        subtract(10, 5);
    }
}

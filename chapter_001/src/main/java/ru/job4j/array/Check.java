package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            if (datum) {
                continue;
            }
            result = false;
        }
        return result;
    }
}

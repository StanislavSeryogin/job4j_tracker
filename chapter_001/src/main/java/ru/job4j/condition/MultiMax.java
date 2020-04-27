package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        return (first > second) ? (Math.max(first, third)) : (Math.max(second, third));
    }
}
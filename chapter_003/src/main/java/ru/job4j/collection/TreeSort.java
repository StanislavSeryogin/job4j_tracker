package ru.job4j.collection;

import java.util.*;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);
    }
}

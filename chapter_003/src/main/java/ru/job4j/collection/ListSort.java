package ru.job4j.collection;

import java.util.*;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list + System.lineSeparator());

        Integer first = 1;
        Integer second = 2;
        int rsl = first.compareTo(second);
        System.out.println("value compareTo: " + rsl + System.lineSeparator());

        String p = "Petr";
        String i = "Ivan";
        int rslStr = p.compareTo(i);
        System.out.println("value compareTo: " + rslStr + System.lineSeparator());
    }
}

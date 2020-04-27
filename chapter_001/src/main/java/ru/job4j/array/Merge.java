package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0;
        int b = 0;
        while (a + b < rsl.length) {
            if (b == right.length || a  != left.length
                    && left[a] < right[b]) {
                rsl[a + b] = left[a++];
            } else {
                rsl[a + b] = right[b++];
            }
        }
        for (int x : rsl) {
            System.out.print(x + "  ");
        }
        return rsl;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

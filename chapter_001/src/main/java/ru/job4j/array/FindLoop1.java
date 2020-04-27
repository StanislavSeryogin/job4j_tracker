package ru.job4j.array;

public class FindLoop1 {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int x = start; x < finish; x++) {
            if (data[x] == el) {
                rst = x;
                break;
            }
        }
        return rst;
    }
}

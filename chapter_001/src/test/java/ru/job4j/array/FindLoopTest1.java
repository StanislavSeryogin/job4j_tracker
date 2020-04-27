package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest1 {

    @Test
    public void whenArrayHas3() {
        int[] input = new int[]{5, 10, 3};
        int value = 3;
        int result = FindLoop1.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4() {
        int[] input = new int[]{5, 10, 3};
        int value = 4;
        int result = FindLoop1.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }


    @Test
    public void whenFind8() {
        int[] input = new int[]{5, 2, 10, 6, 4, 8};
        int value = 7;
        int start = 0;
        int finish = 3;
        int result = FindLoop1.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop1.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
}

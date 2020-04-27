package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenMax() {
        SqMax check = new SqMax();
        int result = check.max(10, 6, 4, 3);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax1() {
        SqMax check = new SqMax();
        int result = check.max(6, 8, 4, 3);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax2() {
        SqMax check = new SqMax();
        int result = check.max(5, 4, 7, 6);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax3() {
        SqMax check = new SqMax();
        int result = check.max(3, 6, 2, 9);
        assertThat(result, is(9));
    }
}

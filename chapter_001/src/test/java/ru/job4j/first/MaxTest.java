package ru.job4j.first;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 1, 2, 7);
        assertThat(result, is(7));
    }
}

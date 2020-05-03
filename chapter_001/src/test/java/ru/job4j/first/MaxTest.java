package ru.job4j.first;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax7() {
        int result = Max.max(2, 1, 2, 7);
        assertThat(result, is(7));
    }
}

package ru.job4j;


import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax1() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax3() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax4() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 4, 4);
        assertThat(result, is(4));
    }
}

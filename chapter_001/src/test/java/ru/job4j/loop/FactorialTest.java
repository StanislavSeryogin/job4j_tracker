package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = Factorial.calc(5);
        assertThat(result, is(120));
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZerothenOne() {
        int result = Factorial.calc(0);
        assertThat(result, is(1));
    }
}

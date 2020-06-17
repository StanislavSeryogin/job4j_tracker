package ru.job4j.lambda;

import org.junit.Test;
import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CounTTest {
    private final CounT function = new CounT();

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        List<Double> result = function.diapason(5, 8, x -> 2 * x * x + 1);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunction() {
        List<Double> result = new ArrayList<>();
        result.addAll(function.diapason(10, 11, Math::log10));
        result.addAll(function.diapason(100, 101, Math::log10));
        List<Double> expected = Arrays.asList(1D, 2D);
        assertThat(result, is(expected));
    }
}
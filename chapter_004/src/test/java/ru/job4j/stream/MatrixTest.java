package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void convert() {
        Matrix matrix = new Matrix();
        Integer[][] intArray = {
                {0, 1},
                {2, 3},
                {4, 5}
        };
        List<Integer> result = matrix.convert(intArray);
        List<Integer> exp = List.of(0, 1, 2, 3, 4, 5);
        assertThat(result, is(exp));
    }
}
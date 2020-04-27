package ru.job4j.first;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void sqarea() {
        double in = SqArea.square(4.0, 3.0);
        double expected = 0.75;
        if (in != expected) {
            Assert.fail();
        }
    }

    @Test
    public void sqarea1() {
        double in = SqArea.square(6, 2);
        double expected = 2;
        if (in != expected) {
            Assert.fail();
        }
    }
}

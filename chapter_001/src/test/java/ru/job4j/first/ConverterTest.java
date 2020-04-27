package ru.job4j.first;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToDollar() {
        int in = 60;
        int expected = 1;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToEuro() {
        int in = 70;
        int expected = 1;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble() {
        double in = 1;
        double expected = 70;
        double out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void dollarToRuble() {
        double in = 1;
        double expected = 60;
        double out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}

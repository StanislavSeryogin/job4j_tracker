package ru.job4j.first;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.first.Point;

public class PointTest {

    @Test
    public void distance3d() {
        Point a = new Point(0, 1, 0);
        Point b = new Point(2, 0, 3);
        double expected = 3.7;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.1);
    }
    @Test
    public void distance() {
        Point a = new Point(0, 3);
        Point b = new Point(2, 0);
        double expected = 3.6;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}

package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.FirstHomeWork.distance;

public class PointDistanceTests {

    @Test
    public void testDistance() {
        Point first = new Point(1, 1);
        Point second = new Point(1, 2);
        Assert.assertEquals(distance(first, second), 1);
    }
}
// Пример простого теста.
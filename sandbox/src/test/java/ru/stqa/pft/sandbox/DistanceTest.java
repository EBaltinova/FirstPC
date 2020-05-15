package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {
    @Test
    public void testDistance() {
        Point p1 = new Point(2,3);
        Point p2 = new Point (5,7);
        Assert.assertEquals(p1.distance(p2),5);

        Point p3 = new Point(7,6);
        Point p4 = new Point (2,9);
        Assert.assertEquals(p3.distance(p4),10);
    }
}





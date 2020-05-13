package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(6);
        assert s.area() == 36;
    }
}

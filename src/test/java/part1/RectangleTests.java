package part1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTests {
    private final Shape rectangle = new Rectangle(4, 8);

    @Test
    public void calculateAreaTest() {
        assertEquals(32, rectangle.calculateArea(), 0.001);
    }

    @Test
    public void calculateVolumeTest() {
        assertEquals(0, rectangle.calculateVolume(), 0.001);
    }
}

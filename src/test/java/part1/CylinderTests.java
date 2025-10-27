package part1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CylinderTests {
    private final Shape cylinder = new Cylinder(3, 7);

    @Test
    public void calculateAreaTest() {
        assertEquals(188.496, cylinder.calculateArea(), 0.001);
    }

    @Test
    public void calculateVolumeTest() {
        assertEquals(197.920, cylinder.calculateVolume(), 0.001);
    }
}

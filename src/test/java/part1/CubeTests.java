package part1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CubeTests {
    private final Shape cube = new Cube(4);

    @Test
    public void calculateAreaTest() {
        assertEquals(96, cube.calculateArea(), 0.001);
    }

    @Test
    public void calculateVolumeTest() {
        assertEquals(64, cube.calculateVolume(), 0.001);
    }
}

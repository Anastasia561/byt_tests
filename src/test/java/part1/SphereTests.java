package part1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SphereTests {
    private final Shape sphere = new Sphere(5);

    @Test
    public void calculateAreaTest() {
        assertEquals(314.159, sphere.calculateArea(), 0.001);
    }

    @Test
    public void calculateVolumeTest() {
        assertEquals(523.598, sphere.calculateVolume(), 0.001);
    }
}

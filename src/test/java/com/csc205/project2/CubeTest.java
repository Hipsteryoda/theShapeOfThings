package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CubeTest {

    private Cube cube;

    @BeforeEach
    public void setUp() {
        cube = new Cube(5.0);
    }

    @Test
    public void testGetWidth() {
        assertEquals(5.0, cube.getWidth());
    }

    @Test
    public void testSetWidth() {
        cube.setWidth(6.0);
        assertEquals(6.0, cube.getWidth());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(150.0, cube.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(125.0, cube.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Cube {width=5.0, surface area=150.0, volume=125.0}";
        assertEquals(expected, cube.toString());
    }
}
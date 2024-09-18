package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    private Cylinder cylinder;

    @BeforeEach
    public void setUp() {
        cylinder = new Cylinder(4.0, 1.0);
    }

    @Test
    public void testGetHeight() {
        assertEquals(4.0, cylinder.getHeight());
    }

    @Test
    public void testSetHeight() {
        cylinder.setHeight(5.0);
        assertEquals(5.0, cylinder.getHeight());
    }

    @Test
    public void testGetRadius() {
        assertEquals(1.0, cylinder.getRadius());
    }

    @Test
    public void testSetRadius() {
        cylinder.setRadius(2.0);
        assertEquals(2.0, cylinder.getRadius());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(31.41592653589793, cylinder.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(12.566370614359172, cylinder.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Cylinder {height=4.0, radius=1.0, surface area=31.41592653589793, volume=12.566370614359172}";
        assertEquals(expected, cylinder.toString());
    }
}
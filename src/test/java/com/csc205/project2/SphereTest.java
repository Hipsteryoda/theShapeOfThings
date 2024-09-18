package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SphereTest {

    private Sphere sphere;

    @BeforeEach
    public void setUp() {
        sphere = new Sphere(2.0);
    }

    @Test
    public void testGetRadius() {
        assertEquals(2.0, sphere.getRadius());
    }

    @Test
    public void testSetRadius() {
        sphere.setRadius(3.0);
        assertEquals(3.0, sphere.getRadius());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(50.26548245743669, sphere.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(33.510321638291124, sphere.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Sphere {radius=2.0, surface area=50.26548245743669, volume=33.510321638291124}";
        assertEquals(expected, sphere.toString());
    }
}
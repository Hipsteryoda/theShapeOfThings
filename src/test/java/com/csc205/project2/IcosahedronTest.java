package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IcosahedronTest {
  private Icosahedron icosahedron;

  @BeforeEach
  public void setUp() {
    icosahedron = new Icosahedron(3.0);
  }

  @Test
  public void testGetSideLength() {
    assertEquals(3.0, icosahedron.getSideLength());
  }

  @Test
  public void testSetSideLength() {
    icosahedron.setSideLength(4.0);
    assertEquals(4.0, icosahedron.getSideLength());
  }

  @Test
  public void testSurfaceArea() {
    assertEquals(77.94228, icosahedron.surfaceArea(), 0.0001);
  }

  @Test
  public void testVolume() {
    assertEquals(58.90576, icosahedron.volume(), 0.0001);
  }

  @Test
  public void testToString() {
    assertEquals("Icosahedron {side length=3.0, surface area=77.94228634059947, volume=58.90576474687264}", icosahedron.toString());
  }

}

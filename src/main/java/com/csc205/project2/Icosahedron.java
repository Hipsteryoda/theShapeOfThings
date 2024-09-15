package com.csc205.project2;

public class Icosahedron extends Shape {
  private double sideLength;

  public Icosahedron() {
    this.sideLength = 3.0;
  }

  public Icosahedron(double sideLength) {
    this.sideLength = sideLength;
  }

  public double getSideLength() {
    return this.sideLength;
  }

  public double setSideLength(double sideLength) {
    return this.sideLength = sideLength;
  }

  @Override
  public double volume() {
    return 2.182 * Math.pow(this.sideLength, 3.0); 
  }

  @Override
  public double surfaceArea() {
    // 20 * 1/2 * sideLength * height
    double height = (this.sideLength * Math.sqrt(3.0)) / 2.0;
    return 20.0 * (0.5 * this.sideLength * height); 
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Icosahedron {");
    sb.append("side length=").append(this.sideLength);
    sb.append(", surface area=").append(this.surfaceArea());
    sb.append(", volume=").append(this.volume());
    sb.append("}");
    return sb.toString();
  }

}

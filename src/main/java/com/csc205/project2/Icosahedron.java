package com.csc205.project2;

public class Icosahedron extends Shape {
  private double sideLength;

  public Icosahedron() {
    super();
    this.sideLength = 3.0;
  }

  public Icosahedron(double sideLength) {
    super();
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
    return (5.0 / 12.0) * (3.0 + Math.sqrt(5.0)) * Math.pow(this.sideLength, 3.0); 
  }

  @Override
  public double surfaceArea() {
    return 20.0 * ((Math.sqrt(3.0) / 4.0) * Math.pow(this.sideLength, 2.0));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(this.getClass().getSimpleName() + " {");
    sb.append("side length=").append(this.sideLength);
    sb.append(", surface area=").append(this.surfaceArea());
    sb.append(", volume=").append(this.volume());
    sb.append("}");
    return sb.toString();
  }

}

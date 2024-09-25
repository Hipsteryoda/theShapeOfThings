package com.csc205.project2;

public class Cube extends Shape {

  private double width;

  public Cube() {
    super();
    this.width = 3.0;
  }

  public Cube(double width) {
    super();
    this.width = width;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public double surfaceArea() {
    return Math.pow(this.width, 2) * 6;
  }

  @Override
  public double volume() {
    return Math.pow(this.width, 3);
  }

  @Override
  public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName() + " {");
        sb.append("width=").append(this.width);
        sb.append(", surface area=").append(this.surfaceArea());
        sb.append(", volume=").append(this.volume());
        sb.append("}");
        return sb.toString();
  }
}

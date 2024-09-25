package com.csc205.project2;

public class Cylinder extends Shape {
  private double height;
  private double radius;

  public Cylinder() {
    super();
    this.height = 0.0;
    this.radius = 0.0;
  }

  public Cylinder(double height, double radius) {
    super();
    this.height = height;
    this.radius = radius;
  }

  public double getHeight() {
    return this.height;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  @Override
  public double surfaceArea() {
    // get the total surface area, not the curved surface area
    return (2 * Math.PI * this.radius) * (this.radius + this.height) ;
  }

  @Override
  public double volume() {
    return this.height * Math.PI * Math.pow(this.radius, 2);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName() + " {");
    sb.append("height=").append(this.height);
    sb.append(", radius=").append(this.radius);
    sb.append(", surface area=").append(this.surfaceArea());
    sb.append(", volume=").append(this.volume());
    sb.append("}");
    return sb.toString();
}

}

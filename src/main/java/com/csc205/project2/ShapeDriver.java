package com.csc205.project2;

import java.awt.Choice;
import java.util.Scanner;

public class ShapeDriver {

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    // FIXME: just here to make the code compile
    ThreeDimensionalShape shape = null;

    String choice = getChoice(scnr);

    if (choice.equals("cube")) {
      System.out.println("What is the width of the cube?");
      double width = Double.parseDouble(scnr.nextLine());
      //shape = new Cube(width);
    }
    else if (choice.equals("sphere")) {
      System.out.println("What is the radius of the sphere?");
      double radius = Double.parseDouble(scnr.nextLine());
      //shape = new Sphere(radius);
    }
    else if (choice.equals("cylinder")) {
      System.out.println("What is the height of the cylinder?");
      double height = Double.parseDouble(scnr.nextLine());
      System.out.println("What is the width of the cylinder?");
      double radius = Double.parseDouble(scnr.nextLine());
      //shape = new Cylinder(height, radius);
    }
    else if (choice.equals("icosahedron")) {
      System.out.println("What is the width of the icosahedron?");
      double width = Double.parseDouble(scnr.nextLine());
      //shape = new Icosahedron(width);
    }

    // FIXME: This is not working. String cannot be resolved to a type.
    //shape.toString();
  }

  private static String getChoice(Scanner scnr) {
    boolean valid = false;
    String choice = "";

    System.out.println("Which shape would you like to create?");
    System.out.println("Cube | Sphere | Cylinder");
    choice = scnr.nextLine().toLowerCase();

    while (!valid) {
      if (choice.equals("cube") || choice.equals("sphere") || choice.equals("cylinder") ) {
        valid = true;
      }
      else {
        System.out.println("Please enter either Cube, Sphere, or Cylinder");
        choice = scnr.nextLine();
      }
    }
    return choice;
  }
  //
  //private static Cube makeCube(Scanner scnr) {
  //  double width;
  //
  //  System.out.println("What is the width of the cube?");
  //  width = Double.parseDouble(scnr.nextLine());
  //  Cube shape = new Cube(width);
  //
  //  return shape;
  //}
  //
  //private static Sphere makeSphere(Scanner scnr) {
  //  double radius;
  //
  //  System.out.println("What is the radius of the sphere?");
  //  radius = Double.parseDouble(scnr.nextLine());
  //  Sphere shape = new Sphere(radius);
  //
  //  return shape;
  //}
  //
  //private static Cylinder makeCylinder(Scanner scnr) {
  //  double height;
  //  double radius;
  //
  //  System.out.println("What is the height of the cylinder?");
  //  height = Double.parseDouble(scnr.nextLine());
  //  System.out.println("What is the width of the cylinder?");
  //  radius = Double.parseDouble(scnr.nextLine());
  //  Cylinder shape = new Cylinder(height, radius);
  //
  //  return shape;
  //}
}

package com.csc205.project2;

import java.util.Scanner;

public class ShapeDrawer {

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    ThreeDimensionalShape shape = null;

    String choice = getChoice(scnr);

    if (choice.equals("cube")) {
      System.out.println("What is the width of the cube?");
      double width = Double.parseDouble(scnr.nextLine());
      shape = new Cube(width);
      System.out.println(shape);
      drawCube((Cube) shape);
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
      shape = new Icosahedron(width);
      System.out.println(shape);
      drawIcosahedron((int)width);
    }
  }

  private static String getChoice(Scanner scnr) {
    boolean valid = false;
    String choice = "";

    System.out.println("Which shape would you like to create?");
    System.out.println("Cube | Sphere | Cylinder");
    choice = scnr.nextLine().toLowerCase();

    while (!valid) {
      if (choice.equals("cube") || choice.equals("sphere") || choice.equals("cylinder") || choice.equals("icosahedron")) {
        valid = true;
      }
      else {
        System.out.println("Please enter either Cube, Sphere, Cylinder, or Icosahedron.");
        choice = scnr.nextLine();
      }
    }
    return choice;
  }

  public static void drawCube(Cube cube) {
    double width = cube.getWidth();
    int size = (int)width;
    // Top face
    System.out.print(" ".repeat(size));
    System.out.println("_".repeat(size * 2 + 1));

    // Upper half (top and back edges)
    for (int i = 0; i < size - 1; i++) {
      //System.out.print(" ");
      System.out.print(" ".repeat(size - i - 1));
      System.out.print("/");
      System.out.print(" ".repeat(size * 2));
      System.out.print("/");
      System.out.print(" ".repeat(i));
      System.out.println("|");
    }

    // Middle line (front and right edges)
    //System.out.print(" ");
    System.out.print("/");
    System.out.print("_".repeat(size * 2));
    System.out.print("/");
    System.out.print(" ".repeat(size - 1));
    System.out.println("|");

    // Lower half (front and left edges)
    for (int i = 0; i < size - 1; i++) {
      System.out.print("|");
      System.out.print(" ".repeat(size * 2));
      System.out.print("|");
      System.out.print(" ".repeat(Math.abs(i - size + 1)));
      System.out.println("/");
    }

    // Bottom line
    System.out.print("|");
    System.out.print("_".repeat(size * 2));
    System.out.println("|/");
  }

  public static void drawIcosahedron(int size) {
    // Calculate the number of rows and columns
    int rows = (2 * size) + 1;
    int cols = (2 * size) + 1;

    // Create a 2D character array to represent the icosahedron
    char[][] icosahedron = new char[rows][cols];

    // Initialize the icosahedron with spaces
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            icosahedron[i][j] = ' ';
        }
    }

    // Draw the top and bottom triangles
    for (int i = 0; i <= size; i++) {
        int start = size - i;
        int end = size + i;
        for (int j = start; j <= end; j++) {
            icosahedron[i][j] = '*';
        }
    }

    // Draw the middle triangles
    for (int i = size + 1; i < rows; i++) {
        int start = i - size;
        int end = 2 * size - i;
        for (int j = start; j <= end; j++) {
            icosahedron[i][j] = '*';
        }
    }

    // Print the icosahedron to the console
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(icosahedron[i][j]);
        }
        System.out.println();
    }
}
}

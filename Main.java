//https://www.varsitytutors.com/hotmath/hotmath_help/topics/equation-of-a-circle//

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in); 
    System.out.println("Enter a shape you want me to execute :)\nCircle, Square, Rectangle, Triangle, Trapezoid");
    String shape = userInput.nextLine();
    shape = shape.toLowerCase();
      if(shape.equals("circle")){
        System.out.println("Enter x and y coordinates that touch the line of the circle: ");
        String coordinates = userInput.nextLine();
        System.out.println("Enter radius coordinates: ");
        String coordinates2 = userInput.nextLine();
        System.out.print(distanceCircle(coordinates, coordinates2));
      }
      else if(shape.equals("square")) {
        System.out.println("Enter x and y coordinates:");
        String coordinates = userInput.nextLine();
        System.out.println("The area is " + distance(4, coordinates));
      }
      /*
              int numberOfsides = 4;
        int current = 1;
        int repX = 0;
        int repY = 0;
        int count = 0;
        double vertices[] = new double[4];
        while(current<=numberOfsides) {
          System.out.println("Enter x and y coordinate, so I would be able to determine the lengths of segments");
          String coordinates = userInput.nextLine();
          int comma = coordinates.indexOf(",");
          int x = Integer.parseInt(coordinates.substring(1, comma));
          int y = Integer.parseInt(coordinates.substring(comma+1, coordinates.length()-1));
          if(repX != x || repY != y) {
            double distance = Math.sqrt((y - repY) * (y - repY) + (x - repX) * (x - repX));
            vertices[count] = distance;
            count++;
          }
          repX = x;
          repY = y;
          current++;
        }
        vertices[0] = vertices[1];
        System.out.print("The ares is" + area(vertices[0]))
      */
      else if(shape.equals("rectangle")) {
        for(int i = 0; i<4; i++) {
        System.out.println("Enter x and y coordinates:");
        String coordinates = userInput.nextLine();
        System.out.println("The area is " + distance(4, coordinates));
        }
      }
      else if(shape.equals("triangle")) {
        System.out.println("Enter x and y coordinates:");
        String coordinates = userInput.nextLine();
        System.out.print("The area is " + distance(3, coordinates));
      }
      else if(shape.equals("trapezoid")) {
        System.out.println("Enter x and y coordinates that touch the line of the circle and enter the radius coordinate: ");
        String coordinates = userInput.nextLine();
        System.out.print("The area is " + distanceTrapezoid(4, coordinates));
      }
      else {
        System.out.print("Invalid Input");
      }
      userInput.close();
    }
  //square//
  public static double quadrilateral(double side) {
    double area = side*side;
    return area;
  }
  //rectangle//
  public static double quadrilateral(double length, double width) {
    double area = length*width;
    return area;
  }
  public static double triangle(double length, double width) {
    double area = (length*width)/2;
    return area;
  }
  public static double circle(double radius) {
    double area = Math.PI*Math.pow(radius,2);
    return area;
  }
  //trapezoid//
  public static double quadrilateral(double height, double base1, double base2) {
    double area = height*((base1+base2)/2);
    return area;
  }
  public static double distance(double numberOfpoints, String coordinates) {
    int current = 1;
    int repX = 0;
    int repY = 0;
    int count = 0;
    double vertices[] = new double[(int)numberOfpoints];
    while(current<=numberOfpoints) {
      int comma = coordinates.indexOf(",");
      int x = Integer.parseInt(coordinates.substring(1, comma));
      int y = Integer.parseInt(coordinates.substring(comma+1, coordinates.length()-1));
      if(repX != x || repY != y) {
        double distance = Math.sqrt((y - repY) * (y - repY) + (x - repX) * (x - repX));
            vertices[count] = distance;
            count++;
      }
      repX = x;
          repY = y;
          current++;
    }
    vertices[0] = vertices[1];
    return quadrilateral(vertices[0],vertices[2]);
  }
  public static double distanceCircle(String coordinates, String coordinates2) {
    int current = 1;
    double vertices[] = new double[2];
    int comma = coordinates.indexOf(",");
    int x = Integer.parseInt(coordinates.substring(1, comma));
    int y = Integer.parseInt(coordinates.substring(comma+1,coordinates.length()-1));
    int comma2 = coordinates2.indexOf(",");
    int h = Integer.parseInt(coordinates2.substring(1, comma));
    int k = Integer.parseInt(coordinates2.substring(comma+1,coordinates2.length()-1));
    double radius = Math.sqrt((x-h)*(x-h)+(y-k)*(y-k));
    return circle(radius);
  }

public static double distanceTrapezoid(double numberOfpoints, String coordinates) {
    int current = 1;
    int repX = 0;
    int repY = 0;
    int count = 0;
    double vertices[] = new double[4];
    while(current<=numberOfpoints) {
      int comma = coordinates.indexOf(",");
      int x = Integer.parseInt(coordinates.substring(1, comma));
      int y = Integer.parseInt(coordinates.substring(comma+1, coordinates.length()-1));
      if(repX != x || repY != y) {
        double distance = Math.sqrt((y - repY) * (y - repY) + (x - repX) * (x - repX));
            vertices[count] = distance;
            count++;
      }
      repX = x;
          repY = y;
          current++;
    }
    vertices[0] = vertices[1];
    return quadrilateral(vertices[0],vertices[2], vertices[3]);
  }
}
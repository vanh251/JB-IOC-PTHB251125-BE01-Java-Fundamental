package session11.bai_1;

public abstract class Shape {
     protected String name;
     abstract double getArea();
     abstract double getPerimeter();
     protected void displayInfo() {
          System.out.println("Shape: " + name);
          System.out.println("Area: " + getArea());
          System.out.println("Perimeter: " + getPerimeter());
     }
}

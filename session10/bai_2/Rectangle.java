package session10.bai_2;

public class Rectangle extends Shape {
    private double with;
    private double height;

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    public double area() {
        return with * height;
    }
}

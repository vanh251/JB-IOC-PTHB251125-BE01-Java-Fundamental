package session09.bai_1;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void printInfo(){
        System.out.println("Rectangle: ");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}


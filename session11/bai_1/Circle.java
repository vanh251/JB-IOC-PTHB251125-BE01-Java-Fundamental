package session11.bai_1;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        super.name = "Circle";
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}

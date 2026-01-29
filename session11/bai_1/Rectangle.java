package session11.bai_1;

public class Rectangle extends Shape implements Drawable {
    private double with;
    private double height;

    public Rectangle(double with, double height) {
        super.name = "Rectangle";
        this.with = with;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public double getArea(){
        return with * height;
    }

    public double getPerimeter(){
        return 2 * (with + height);
    }
}

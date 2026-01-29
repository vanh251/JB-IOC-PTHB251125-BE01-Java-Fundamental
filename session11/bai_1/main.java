package session11.bai_1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        shapes.add(circle);
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            shape.displayInfo();
            if (shape instanceof Drawable) {
                ((Drawable) shape).draw();
            }
            System.out.println();
        }
    }
}

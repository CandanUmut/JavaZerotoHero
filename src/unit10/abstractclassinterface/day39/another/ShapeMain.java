package unit10.abstractclassinterface.day39.another;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(4,5,3);
        circle.draw();
        Shape rectngnle = new Rectangle(1,2,3,4);
        rectngnle.draw();
        rectngnle.moveTo(12,123);
        rectngnle.draw();
        ArrayList<Shape> shapes = new ArrayList<>(List.of(circle,rectngnle, new Circle(3,3,3)));

        for (Shape shape:shapes
             ) {
            shape.draw();

        }

    }
}

package principle_02_open_closed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(4);
        List<Shape> shapes = new ArrayList<>(Arrays.asList(circle, square));
        AreaCalculator calculator = new AreaCalculator(shapes);
        System.out.println(calculator.sum());
    }
}

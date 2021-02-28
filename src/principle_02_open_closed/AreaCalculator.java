package principle_02_open_closed;

import java.util.List;

public class AreaCalculator {
    private List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public Double sum(){
        double sum = 0;
        for(Shape shape: shapes) {
            sum += shape.area();
        }
        return sum;
    }
}

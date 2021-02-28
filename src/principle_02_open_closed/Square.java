package principle_02_open_closed;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Double area() {
        return (double) (side * side);
    }
}

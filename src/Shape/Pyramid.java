package Shape;

public class Pyramid extends Shape {
    private final double square;
    private final double height;

    public Pyramid(double volume, double square, double height) {
        super(volume);
        this.square = square;
        this.height = height;
    }

    public double getSquare() {
        return square;
    }

    public double getHeight() {
        return height;
    }
}

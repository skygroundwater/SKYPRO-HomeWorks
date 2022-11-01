package Shape;

public class Shape implements Dimensions {
    private final double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getHeight() {
        return Dimensions.super.getHeight();
    }

    public double getRadius() {
        return Dimensions.super.getRadius();
    }

    public double getSquare() {
        return Dimensions.super.getSquare();
    }

    public boolean add(Dimensions shape) {
        return Dimensions.super.add(shape);
    }

    public static void main(String[] args) {
        try {
            Dimensions box = new Box(18.0);
            Dimensions ball = new Ball(17.0, 15.0);
            Dimensions pyramid = new Pyramid(20.0, 8.0, 10.0);
            System.out.println(box.add(pyramid));
            System.out.println(box.add(ball));
            System.out.println(pyramid.getVolume());
            System.out.println(box.getRadius());
        } catch (StackOverflowError var4) {
            System.out.println("У объекта нет таких данных");
        }

    }
}

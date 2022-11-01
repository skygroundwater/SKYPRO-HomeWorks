package Shape;

public class Cylinder extends SolidOfRevolution {
    private final double height;

    public Cylinder(double volume, double radius, double height) {
        super(volume, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}

package Shape;

public interface Dimensions {
    default double getVolume() {
        return this.getVolume();
    }

    default double getHeight() {
        return this.getHeight();
    }

    default double getSquare() {
        return this.getSquare();
    }

    default boolean add(Dimensions shape) {
        return !(this.getVolume() < shape.getVolume());
    }

    default double getRadius() {
        return this.getRadius();
    }
}

package logic;

public class Pyramid extends Shape {
    private final double baseArea;
    private final double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public double area() {
        return baseArea + (4 * (0.5 * baseArea * height));
    }

    @Override
    public double volume() {
        return (1.0 / 3) * baseArea * height;
    }
}

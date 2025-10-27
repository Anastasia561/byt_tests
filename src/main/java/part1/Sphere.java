package part1;

public record Sphere(double radius) implements Shape {
    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

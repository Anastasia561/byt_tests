package part1;

public record Cylinder(double radius, double height) implements Shape {
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

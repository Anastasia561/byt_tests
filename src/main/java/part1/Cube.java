package part1;

public record Cube(double side) implements Shape {

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}

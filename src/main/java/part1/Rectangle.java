package part1;

public record Rectangle(double length, double width) implements Shape {
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}

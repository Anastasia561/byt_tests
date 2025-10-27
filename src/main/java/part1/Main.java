package part1;

public class Main {
    public static void main(String[] args) {
        // Create a Sphere with radius 5
        Shape sphere = new Sphere(5);
        System.out.println("Sphere:");
        System.out.printf("Area: %.3f%n", sphere.calculateArea());
        System.out.printf("Volume: %.3f%n", sphere.calculateVolume());
        System.out.println("=".repeat(20));


        // Create a Cylinder with radius 3 and height 7
        Shape cylinder = new Cylinder(3, 7);
        System.out.println("Cylinder:");
        System.out.printf("Area: %.3f%n", cylinder.calculateArea());
        System.out.printf("Volume: %.3f%n", cylinder.calculateVolume());
        System.out.println("=".repeat(20));


        // Create a Rectangle with length 4 and width 8
        Shape rectangle = new Rectangle(4, 8);
        System.out.println("Rectangle:");
        System.out.printf("Area: %.3f%n", rectangle.calculateArea());
        System.out.printf("Volume: %.3f%n", rectangle.calculateVolume());
        System.out.println("=".repeat(20));


        // Create a Cube with side 4
        Shape cube = new Cube(4);
        System.out.println("Cube:");
        System.out.printf("Area: %.3f%n", cube.calculateArea());
        System.out.printf("Volume: %.3f%n", cube.calculateVolume());
    }
}

package part2;

public record Calculator(double a, double b, String operation) {
    public double calculate() {
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) throw new ArithmeticException("Division by zero");
                yield a / b;
            }
            default -> throw new ArithmeticException("Unsupported operation");
        };
    }
}

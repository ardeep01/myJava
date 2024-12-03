// Shape interface
interface Shape {
    double area();
    double perimeter();
}

// Diagonal interface
interface Diagonal {
    double calculateDiagonal();
}

// Square class implementing both Shape and Diagonal interfaces
class Square implements Shape, Diagonal {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Implementing area and perimeter from Shape interface
    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    // Implementing calculateDiagonal from Diagonal interface
    @Override
    public double calculateDiagonal() {
        return Math.sqrt(2) * side;
    }
}

// Main class to test the implementation
public class _14 {
    public static void main(String[] args) {
        // Create an instance of Square
        Square square = new Square(5);

        // Using Shape interface methods
        System.out.println("Area of Square: " + square.area());
        System.out.println("Perimeter of Square: " + square.perimeter());

        // Using Diagonal interface method
        System.out.println("Diagonal of Square: " + square.calculateDiagonal());
    }
}

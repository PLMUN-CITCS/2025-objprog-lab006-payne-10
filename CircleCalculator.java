import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        while (!scanner.hasNextDouble()) { // Validate numeric input
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        double radius = scanner.nextDouble();

        // Calculations
        double area = Math.PI * Math.pow(radius, 2); // Area = πr²
        double circumference = 2 * Math.PI * radius; // Circumference = 2πr

        // Output results with formatting
        System.out.printf("Circle with radius %.2f:%n", radius);
        System.out.printf(" - Area: %.2f square units%n", area);
        System.out.printf(" - Circumference: %.2f units%n", circumference);

        // Close scanner
        scanner.close();
    }
}

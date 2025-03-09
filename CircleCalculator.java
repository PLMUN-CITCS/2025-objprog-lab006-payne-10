import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate the area using the formula: Area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

        // Calculate the circumference using the formula: Circumference = 2 * π * r
        double circumference = 2 * Math.PI * radius;

        // Print the results with formatted output (2 decimal places)
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        // Close the Scanner to release resources
        input.close();
    }
}
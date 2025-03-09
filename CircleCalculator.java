import java.util.Scanner; // Import Scanner for user input

public class CircleCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");

        // Read the radius as a double
        double radius = input.nextDouble();

        // Calculate the area using the formula: Area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

        // Calculate the circumference using the formula: Circumference = 2 * π * r
        double circumference = 2 * Math.PI * radius;

        // Display the results with formatted output
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f square units%n", area);
        System.out.printf("Circumference: %.2f units%n", circumference);

        // Close the Scanner to release resources
        input.close();
    }
}

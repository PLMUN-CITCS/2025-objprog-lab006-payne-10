import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read the radius from user input
        double radius = input.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Calculate the circumference of the circle
        double circumference = 2 * Math.PI * radius;

        // Output results with formatted output
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        // Close the Scanner object
        input.close();
    }
}

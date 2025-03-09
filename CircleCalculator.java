public class Exercise11 {
    // Define a constant for the radius of the circle
    private static final double radius = 7.5;

    public static void main(String[] args) {
        // Calculate the circumference (perimeter) of the circle using the constant radius
        double circumference = 2 * Math.PI * radius;

        // Calculate the area of the circle using the constant radius
        double area = Math.PI * Math.pow(radius, 2);

        // Print the calculated radius, area, and circumference with formatted output
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);
    }
}

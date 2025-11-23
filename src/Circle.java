public class Circle {
    // Fields for the circle properties
    private double radius;
    private final double PI = 3.14159;

    // Constructors: One for a given parameter and a fallback for none.
    public Circle(double newRadius) {
        radius = newRadius;
    }

    public Circle() {
        radius = 0.0;
    }

    // Methods

    // Set the radius of the circle
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    // Get the redius of the circle
    public double getRadius() {
        return radius;
    }

    // Return the area of the circle
    public double area() {
        return PI * radius * radius;
    }

    // Return the diameter of the circle
    public double diameter() {
        return radius * 2;
    }

    // Return the circumference
    public double circumference() {
        return 2.0 * PI * radius;
    }
}

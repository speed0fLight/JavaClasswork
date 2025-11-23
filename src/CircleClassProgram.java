import javax.swing.JOptionPane;

public class CircleClassProgram
{
    public static void main(String[] args) {
        double radius = -1;

        // Input validation, accepts a valid number above 0 for radius
        do {
            try {
                radius = Double.parseDouble(
                        JOptionPane.showInputDialog(null, "Input the radius of the circle.")
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a valid number above 0.");
                continue;
            }
            if (radius < 0) {
                JOptionPane.showMessageDialog(null, "Please type a valid number above 0.");
            }
        }
        while (radius < 0);

        Circle newCircle = new Circle(radius);

        double area = newCircle.area();
        double diameter = newCircle.diameter();
        double circumference = newCircle.circumference();

        JOptionPane.showMessageDialog(null,
                "Made by Justin N\n" +
                        "Circle information: \n-------------------------\n\n"            +
                        String.format("The area of the circle is: %f\n", area)           +
                        String.format("The diameter of the circle is: %f\n", diameter)   +
                        String.format("The circumference of the circle is: %f\n", circumference)
        );

    }

}

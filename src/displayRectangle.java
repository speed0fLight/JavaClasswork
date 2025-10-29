import javax.swing.JOptionPane;

/**
 *
 * @author jnegron11 (Justin N)
 *
 */
public class displayRectangle {

    public static void main(String[] args) {

        // Get user input as strings
        String lengthString = JOptionPane.showInputDialog("Enter the rectangle's length:");
        String widthString = JOptionPane.showInputDialog("Enter the rectangle's width:");

        // Check if clicked "Cancel" on either dialog
        if (lengthString != null && widthString != null) {

            // Parse strings to doubles.
            double length = Double.parseDouble(lengthString);
            double width = Double.parseDouble(widthString);

            displayRectangle.displayRectangleInfo(length, width);
        }


    }

    private static void displayRectangleInfo(double length, double width) {
        // Input validation
        if (length > 0.0 && width > 0.0) {

            // Calculate the area
            double area = length * width;

            // output string for the results
            String output = "Program by Justin N\n\nRectangle Details:\n------------------------\n"
                    + String.format("Length: \f%.2f\n", length)
                    + String.format("Width:  \f%.2f\n", width)
                    + String.format("Area:   \f%.2f\n", area);

            // Display the results
            JOptionPane.showMessageDialog(null, output);
        } else {
            // handle any issues
            JOptionPane.showMessageDialog(null, "Length and width must both be positive numbers.");
        }
    }


}
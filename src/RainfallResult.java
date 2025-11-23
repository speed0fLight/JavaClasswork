import javax.swing.JOptionPane;

public class RainfallResult {
    public static void main(String[] args) {
        double[] rainfallInput = new double[12];
        boolean dontAbort = true;

        for (int i = 0; i < 12; i++) {
            if (!dontAbort) {
                break;
            }

            double number = -1;

            while (number == -1) {
                try {
                    number = Double.parseDouble( Input("Input the rainfall (inches) of month #" + (i + 1)) );
                }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Input must be a valid number and non-negative.");
                    continue;
                }
                catch (NullPointerException e) {
                    // User clicked 'cancel' so no input was found.
                    dontAbort = false;
                    break;
                }


                if (number < 0) {
                    // If number is negative, set it back to -1 so the while loop runs again.
                    JOptionPane.showMessageDialog(null, "Input must be a valid number and non-negative.");
                    number = -1;
                }

            }

            rainfallInput[i] = number;
        }


        if (dontAbort) {
            // Create the rainfall object
            Rainfall report = new Rainfall(rainfallInput);

            // Display results
            String formatted = String.format(
                            "Rainfall results\n" +
                            "\nTotal rainfall: %.1f" +
                            "\nAverage rainfall: %.1f" +
                            "\nHighest rainfall: %.1f" +
                            "\nLowest rainfall: %.1f" +
                            "\nMade by Justin N",
                            report.totalRainfall(),
                            report.avgRainfall(),
                            report.mostRainfall(),
                            report.lowestRainfall()
            );

            JOptionPane.showMessageDialog(null, formatted);
        }



    }

    // shorten this long function basically
    public static String Input(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }


        
}

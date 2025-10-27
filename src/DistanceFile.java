import javax.swing.JOptionPane;
import java.io.*;

public class DistanceFile {
    public static void main(String[] args) {
        // validate speed input
        String mphString = JOptionPane.showInputDialog("Input the miles per hour.");
        double mph = Double.parseDouble(mphString);
        // input validation
        while (mph < 0.0) {
            JOptionPane.showMessageDialog(null, "Speed must not be negative. Please try again.");
            mphString = JOptionPane.showInputDialog("Input the miles per hour.");
            mph = Double.parseDouble(mphString);
        }
        // Get and validate hours input
        String hoursString = JOptionPane.showInputDialog("Input the time traveled as hours.");
        int hours = Integer.parseInt(hoursString);
        // Input validation loop for hours
        while (hours < 1) {
            JOptionPane.showMessageDialog(null, "Hours must be at least 1. Please try again.");
            hoursString = JOptionPane.showInputDialog("Input the time traveled as hours.");
            hours = Integer.parseInt(hoursString);
        }
        // Build the output string
        String output = "Made by Justin N\nMPH: " + mph + "\nHour Distance Traveled (Miles)\n--------------------------------------------\n";
        // Perform distance calculations
        for (int i = 1; i <= hours; i++) {
            double distance = mph * i;
            output += String.format("\n%d %.2f", i, distance);
        }

        // Write the string to a file
        File results = new File("/Users/speed0fLight/IdeaProjects/JavaClasswork/src/Results.txt");
        if (results.exists()) {
            try {
                PrintWriter out = new PrintWriter(results);
                out.println(output);
                out.close();
                JOptionPane.showMessageDialog(null, "Finished writing to Results.txt");
            }
            catch (FileNotFoundException exception) {
                JOptionPane.showMessageDialog(null,"File not found");
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(null,"No file.");
        }
    }
}

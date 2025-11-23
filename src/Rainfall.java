public class Rainfall {
    // Initialize the 12 month rainfall array.
    double[] rainfallReport = new double[12];

    Rainfall(double[] newReport) {
        // Loop through the given report, and copy it to the object.
        for (int i = 0; i < newReport.length; i++) {
            rainfallReport[i] = newReport[i];
        }
    }

    double totalRainfall() {
        // Return the total rainfall of 12 months
        double total = 0;
        for (double monthlyRainfall : rainfallReport) {
            total += monthlyRainfall;
        }

        return total;
    }

    double avgRainfall() {
        // Return the average rainfall of the 12 months.
        return totalRainfall()/12;
    }

    double mostRainfall() {
        // Return the highest monthly rainfall
        double highest = 0;
        for (double monthlyRainfall : rainfallReport) {
            // If monthlyRainfall is greater
            // than the highest one already found,
            // Use that value instead.

            if (monthlyRainfall > highest) {
                highest = monthlyRainfall;
            }
        }

        return highest;
    }

    double lowestRainfall() {
        // Return the lowest monthly rainfall
        double lowest = rainfallReport[0];
        for (double monthlyRainfall : rainfallReport) {
            // If monthlyRainfall is lower
            // than the lowest one already found,
            // Use that value instead.

            if (monthlyRainfall < lowest) {
                lowest = monthlyRainfall;
            }
        }

        return lowest;
    }



}

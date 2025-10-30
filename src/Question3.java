public class Question3 {
    public static void main(String[] args) {
        // Setting up variables
        double sales = 12500.0;
        double commission;

        // Defining logic
        if (sales <= 10000.0) {
            commission = 0.10;
        } else if (sales <= 15000.0) {
            commission = 0.15;
        } else {
            commission = 0.20;
        }

        // Output the results
        System.out.println("Made by Justin N");
        System.out.println("For sales of $" + sales);
        System.out.println("The commission rate is: " + commission);
    }
}
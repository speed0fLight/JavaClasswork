public class CoinDemo {
    public static void main(String[] args) {
        // Variables to track the counts
        int headsCount = 0;
        int tailsCount = 0;
        final int NUM_TOSSES = 20;

        // Display program header
        System.out.println("Coin Toss");
        System.out.println("Author: Justin N");
        System.out.println("-------------------------");
        System.out.println();

        // Instantiate a Coin object
        Coin myCoin = new Coin();

        // output the initial side
        System.out.println("Initial side up: " + myCoin.getSideUp());
        System.out.println();
        System.out.println("--- Starting " + NUM_TOSSES + " Coin Tosses ---");

        // Use the initial state in the count
        if (myCoin.isHeads()) {
            headsCount++;
        } else {
            tailsCount++;
        }

        // Toss 20 times
        for (int i = 1; i <= NUM_TOSSES; i++) {
            // Get a new side
            myCoin.toss();

            // output toss
            String result = myCoin.getSideUp();
            System.out.printf("Toss #%d: %s\n", i, result);

            // count heads, tails
            if (myCoin.isHeads()) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("-----------------------------------------");

        // Print the # of outcomes for each side
        System.out.println("--- Results ---");
        System.out.println("Total Tosses: " + NUM_TOSSES);
        System.out.println("Heads Count: " + headsCount);
        System.out.println("Tails Count: " + tailsCount);
        System.out.println("-----------------------------------------");
    }
}
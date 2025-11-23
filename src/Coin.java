import java.util.Random;

public class Coin {
    // Declare fields for class
    private String sideUp;

    // Constructor
    public Coin() {
        sideUp = "heads";
    }

   // Emulate a coin toss
    public void toss() {
        // Create a Random object for tossing
        Random rand = new Random();

        // Generate a random number which is either 0 or 1
        if (rand.nextInt(2) == 0) {
            sideUp = "heads";
        } else {
            sideUp = "tails";
        }
    }

    // Checks if the side is heads
    public boolean isHeads() {
        return sideUp.equalsIgnoreCase("heads");
    }

    // Return the name of the side
    public String getSideUp() {
        return sideUp;
    }
}
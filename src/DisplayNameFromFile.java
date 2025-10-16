import java.io.*;
import java.util.Scanner;

public class DisplayNameFromFile {
    public static void main(String[] args) {
        // 4.21 Write code that does the following:
        //    opens a file named MyName.txt, reads the first
        //    line from the file and displays it,
        //    and then closes the file.

        // Open the file named MyName.txt
        File file = new File("C:\\Users\\justi\\IdeaProjects\\JavaClasswork\\src\\MyName.txt");
        if (file.exists()) {
            try {
                // Print the first line of that file
                Scanner fileScanner = new Scanner(file);
                System.out.println(fileScanner.nextLine());
            }
            catch (FileNotFoundException e) {
                System.exit(0);
            }
        }
        else {
            System.out.println("File not found.");
        }

    }
}

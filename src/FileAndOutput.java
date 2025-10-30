import java.io.*;

public class FileAndOutput {
    public static void main(String[] args) {
        /* 4.19 Write code that does the following:
        opens a file named MyName.txt, writes your
        first name to the file, and then closes the file.*/

        // Open a file
        String fileName = "C:\\Users\\justi\\IdeaProjects\\JavaClasswork\\src\\MyName.txt";
        File file = new File(fileName);

        // Write the name to the file
        if (file.exists()) {
            try {
                PrintWriter out = new PrintWriter(file);
                out.println("Justin");
                out.close();
                System.out.println("Finished Writing Name.");
            }
            catch (FileNotFoundException exception) {
                System.out.println("File not found");
                System.exit(0);
            }
        } else {
            System.out.println("No file.");
        }


    }
}

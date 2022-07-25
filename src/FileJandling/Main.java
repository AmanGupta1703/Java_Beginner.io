package FileJandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// FileReading => reading and writing to file is an important aspect

public class Main {
    public static void main(String[] args) throws IOException {

        // Creating a new file
        File file = new File("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\FileJandling\\out.txt");
        file.createNewFile();

        // Code to write to a file
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("This is our first created file\nFile Created\nDate Created: 20/2/2022");
        fileWriter.close();

        // Code to read a file
        FileReader fileReader = new FileReader("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\FileJandling\\out.txt");
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();

        //  Deleting a file
        File file1 = new File("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\FileJandling\\out.txt");
        if (file1.delete()) {
            System.out.println("File Deleted: " + file1.getName());
        } else {
            System.err.println("Error found while deleting the file.");
        }

    }
}

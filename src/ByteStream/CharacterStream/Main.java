package ByteStream.CharacterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\ByteStream\\CharacterStream\\Test1.txt");
            fileWriter = new FileWriter("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\ByteStream\\CharacterStream\\Test2.txt");

            // Reading the source file and writing it to the target file.
            int content;
            while((content = fileReader.read()) != -1) {    // continue reading a file character by character as long as it returns -1
                fileWriter.append((char)content); // writing a file character by character
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileReader != null) {
                fileReader.close();
            if(fileWriter != null) {
                fileWriter.close();
            }
            }
        }
    }
}

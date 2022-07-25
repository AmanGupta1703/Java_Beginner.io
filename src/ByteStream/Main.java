package ByteStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;      // read a file
        FileOutputStream fileOutputStream = null;   //  write to a file

        try {
            fileInputStream = new FileInputStream("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\ByteStream\\SampleText.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\ByteStream\\SampleText2.txt");

            //read a byte at a time, if it reaches the end of the file, return -1
            int content;

            while((content = fileInputStream.read()) != -1) {
                fileOutputStream.write((byte)fileInputStream.read());  // write it to the fileOutputStream file
                //fileOutputStream.write((byte)content);  // write it to the fileOutputStream file
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileInputStream != null) {
                fileInputStream.close();
            }
            if(fileOutputStream != null) {
                fileOutputStream.close();
            }
        }

    }
}

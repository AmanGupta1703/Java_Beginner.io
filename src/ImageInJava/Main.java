package ImageInJava;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
// java.lang(never needs to be imported)  -> contains all the types -> variable types, dataTypes
//java.util(needs to be imported before using) -> contains all the collections framework
 public class Main {
    public static void main(String[] args) {
        int width = 600;
        int height = 1000;
        BufferedImage image = null; // creating a reference(image) for the BufferImage Class
        image = readFromFile(width, height, image);
        writeToFile(image);
    }

    public static BufferedImage readFromFile(int width, int height, BufferedImage image) {
        try {
            String imagePath = "C:\\Users\\Kunal\\Pictures\\Saved Pictures\\Mai Sakurajima.jpg";    // Image File Path.

            File imageFile = new File(imagePath); // Create a file object and pass the image filePath
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);  // Creating an object of the BufferObject.

            image = ImageIO.read(imageFile);    // Reading input file(reading the whole image in 2d byte array & copying it to the image)
            System.out.println("Reading Complete: " + image.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return image;
    }
    public static BufferedImage writeToFile(BufferedImage image) {
        try {
            String outputFileName = "C:\\Users\\Kunal\\Pictures\\Saved Pictures\\out.jpg";
            File output  = new File(outputFileName);

            ImageIO.write(image, "jpg", output);
            System.out.println("Writing Complete: "+ image.toString());
        } catch(IOException e){
            System.out.println("Error: "+ e);
        }
        return image;
    }
}

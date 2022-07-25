package ModernCalculator;

import java.util.Scanner;

public class ReadInput {
   public static String readInput() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input the expression: ");
       String inputLine = sc.nextLine();
       sc.close();
       return inputLine;
   }
}

package ErrorsNExceptions;

// Syntax  error => compiler finds something wrong with our program (For ex: int a = 5 (semiColon missing.)) (encountered by the programmers)
// Logical error => when a program compiles and runs but does the wrong thing (AKA Bug) (encountered by the programmers)
// Runtime error => encounter an error when the program is running. (encountered by the users)

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         int[] numbers = new int[3];
         numbers[0] = 12;
         numbers[1] = 45;
         numbers[2] = 6;

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the index of the array: ");
         int index = scanner.nextInt();

         System.out.print("Enter the number you want to divide the value of the array index with: ");
         int number = scanner.nextInt();

         try {
         System.out.println("The value of array at index " + index +  ": "+ numbers[index]);
         System.out.println("After dividing it with inputted number: " + numbers[index] / number);
         } catch (ArithmeticException e) {
         System.err.println(e.getMessage());
         }  catch (ArrayIndexOutOfBoundsException e) {
         System.err.println(e.getMessage());
         }  catch (Exception e) {
         System.err.println(e.getMessage());
         }

         // Nested try-catch block

         // Declaring variables
         int[] numbers = new int[3];
         int index;
         boolean flag = true;

         // Creating Scanner object
         Scanner scanner = new Scanner(System.in);

         // Assigning values to the array
         numbers[0] = 12;
         numbers[1] = 45;
         numbers[2] = 6;

         // Input from the user
         System.out.print("Enter the value of index: ");
         index = scanner.nextInt();

         while (flag) {
         try {
         System.out.println("Nested Try-Catch Block");
         try {
         System.out.println("The value of array at index " + index + ": " + numbers[index]);

         } catch (ArrayIndexOutOfBoundsException e) {
         System.err.println("Specified input does not exist.");
         System.err.println("Exception in level 2 (try-catch-block)(Exception inside the try-catch-block)");
         flag = false;
         }

         } catch (Exception e) {
         System.err.println("Exception in level 1 (try-catch-block)");
         flag = false;
         }
         System.out.println("End of the program!");
         }


        // Exception Class

        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        if (!Objects.equals(name, "Aman")) {
            try {
                throw new NameException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
            } finally {
                System.out.println("Done");
            }
        }
        */

        // Finally block

        int number = 1;
        int a = 12;
        int b = 2;

        for(int i = 5; i>=1; i--) {
            try{
                System.out.println("Value after dividing ( ): " + a/b);

            } catch(Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("End of the program: "+ b);
            }
            b--;
        }

    }
}

class NameException extends Exception {
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }

    @Override
    public String toString() {
        return "I am toString()";
    }
}
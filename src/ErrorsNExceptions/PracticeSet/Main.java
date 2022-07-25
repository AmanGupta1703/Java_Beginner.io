package ErrorsNExceptions.PracticeSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MaxTryReachedException {
        // Question 2

        /**
        try {
            int a = 5 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Haha");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
        */

        // Question 3

        int[] numberArray = new int[3];
        numberArray[0] = 12;
        numberArray[1] = 13;
        numberArray[2] = 14;

        int num_Of_Tries = 1;
        int index;
        int max_Num_Of_Tries = 5;

       Scanner sc = new Scanner(System.in);

       while(true && num_Of_Tries <= max_Num_Of_Tries) {

           try {
               System.out.print("Enter the value of index: ");
               index = sc.nextInt();
               System.out.println("The value of array at index " + index + ": " + numberArray[index]);
               break;
           } catch(Exception e) {
               System.out.println("Invalid Index...Error");
               System.out.println("Number of tries: "+ num_Of_Tries + "\nNumber of tries left: "+ (max_Num_Of_Tries - num_Of_Tries));
               System.out.println("============================");
               num_Of_Tries++;
           }
       }
        if(num_Of_Tries > 5) {

            try {
                throw new MaxTryReachedException();
            } catch(MaxTryReachedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MaxTryReachedException extends Exception {
    @Override
    public String getMessage() {
        return "Error :(";
    }
}
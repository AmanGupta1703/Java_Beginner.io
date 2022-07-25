package Synchronized;

public class MathOperation {

     void getMultiples(int n) {
         synchronized (this) {          // only one thread will be accessing the code block.
             for (int i = 1; i <= 5; i++) {
                 System.out.println(n * i);
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }
     }
}

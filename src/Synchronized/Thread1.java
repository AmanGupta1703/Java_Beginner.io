package Synchronized;

public class Thread1 extends Thread {
    MathOperation mathOperation;
    public Thread1(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }
    @Override
    public void run() {
        try{
            mathOperation.getMultiples(2);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

package Synchronized;

public class Thread2 implements Runnable{
    MathOperation mathOperation;
    public Thread2(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }
    @Override
    public void run() {
        try {
            mathOperation.getMultiples(3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

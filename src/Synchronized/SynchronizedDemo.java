package Synchronized;
// synchronized -> where one thread is accessing the object and two thread are never mutating the same object at a same time.

public class SynchronizedDemo {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        Thread1 thread1 = new Thread1(mathOperation);
        Thread thread2 = new Thread(new Thread2(mathOperation));
        thread1.start();    // thread1 occupied the getMultiples method or locked the method
        thread2.start();     // after completion of thread1 -> thread2 begins
    }
}

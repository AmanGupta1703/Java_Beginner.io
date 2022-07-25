package MultiThreading;

// Thread Life Cycle
// New  => instance of the thread created
// Runnable => After invocation of start() and before it is selected by the thread scheduler  =>   Not Runnable
// Running  => After the Thread scheduler has selected the thread                             =>   Not Runnable
// Not Runnable => Thread alive, not eligible to run
// Terminated   => run() has exited

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         WalkingThread walkingThread = new WalkingThread();
         walkingThread.setName("Aman");

         SpeakingThread speakingThread = new SpeakingThread();
         speakingThread.setName("Aman");

         RunningThread runningThread = new RunningThread();
         runningThread.setName("Aman");

         // Start
         walkingThread.start();
         speakingThread.start();
         runningThread.start();

         // Get name of the thread.
         System.out.println("WalkingThread: "+ walkingThread.getName());
         System.out.println("SpeakingThread: "+ speakingThread.getName());
         System.out.println("RunningThread: "+ runningThread.getName());


        EatingThread eatingThread = new EatingThread();
        Thread HumanBeing = new Thread(eatingThread);

        DrinkingThread drinkingThread = new DrinkingThread();
        Thread humanBeing = new Thread(drinkingThread);

        // start
        HumanBeing.start();
        humanBeing.start();


        // Thread Constructor

        // Creating eating-thread object
        EatingThread eatingThread = new EatingThread();

        // Passing eating-thread reference as an argument in WalkingThread Constructor
        WalkingThread walkingThread = new WalkingThread("Aman", eatingThread);

        // Creating a new Thread object with reference of human and passing eating-thread(which implements a runnable interface) as an argument
        Thread human = new Thread(eatingThread);

        walkingThread.start();
        human.start();

        System.out.println("WalkingThread ID: "+ walkingThread.getId());
        System.out.println("WalkingThread Name: "+ walkingThread.getName());


        // Thread Priorities

        // Ready Queue => ready to run (maintained by JVM)
        WalkingThread walkingThread = new WalkingThread("Aman");
        SpeakingThread speakingThread = new SpeakingThread();
        RunningThread runningThread = new RunningThread();

        // Priority
        walkingThread.setPriority(Thread.MAX_PRIORITY);
        speakingThread.setPriority(Thread.MIN_PRIORITY);
        runningThread.setPriority(Thread.MIN_PRIORITY);

        // start
        walkingThread.start();
        speakingThread.start();
        runningThread.start();
        */

        // Thread Methods
        WalkingThread walkingThread = new WalkingThread();
        SpeakingThread speakingThread = new SpeakingThread();

        walkingThread.start();
        //walkingThread.join();   // waits till walkingThread has completed its execution

        speakingThread.start();
    }
}

class WalkingThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("#" + i + "." + "Walking...");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("WalkingThread completed it's process\n");
    }
}

class SpeakingThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("#"+ i + "." +"Speaking...");
        }
        System.out.println("SpeakingThread completed it's process");
    }
}

class RunningThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Running...");
        }
    }
}

// Implements Runnable
class EatingThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Eating...");
        }
    }
}

class DrinkingThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Drinking...");
        }
    }
}


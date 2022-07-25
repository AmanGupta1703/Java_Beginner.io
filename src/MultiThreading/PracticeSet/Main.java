package MultiThreading.PracticeSet;

// TIMED_WAITING => “A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.”

public class Main {
    public static void main(String[] args) {
        // Creating objects
        WelcomeThread welcomeThread = new WelcomeThread();
        HelloWorldThread helloWorldThread = new HelloWorldThread();

        // Setting the priority of the thread
        welcomeThread.setPriority(6);
        helloWorldThread.setPriority(2);

        // Running the thread
        welcomeThread.start();
        helloWorldThread.start();

        // getting the priority of the thread
        System.out.println("\nThread Priority: ");
        System.out.println("HelloWorldThread Priority: "+ helloWorldThread.getPriority());
        System.out.println("WelcomeThread Priority: "+ welcomeThread.getPriority());

        // Returning the state of this thread.
        System.out.println("\nThread State: ");
        System.out.println("HelloWorldThread State: "+ helloWorldThread.getState());
        System.out.println("WelcomeThread State: "+ welcomeThread.getState());

        // Returning a reference to the currently executing thread object.
        System.out.println("\nThread Reference:");
        System.out.println("HelloWorldThread Reference: "+ Thread.currentThread().getState());
        System.out.println("WelcomeThread Reference: "+ Thread.currentThread().getState());
    }
}

class WelcomeThread extends Thread {
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Welcome!");
        }
    }
}

class HelloWorldThread extends Thread {
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Hello, World!");
        }
    }
}

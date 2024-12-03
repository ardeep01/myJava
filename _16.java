// Class implementing Runnable interface
class PriorityThread implements Runnable {
    private String threadName;

    public PriorityThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(100); // Sleep for a short time to simulate work
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished execution.");
    }
}

// Main class
public class _16 {
    public static void main(String[] args) {
        // Creating Runnable instances
        PriorityThread runnable1 = new PriorityThread("Low Priority Thread");
        PriorityThread runnable2 = new PriorityThread("Normal Priority Thread");
        PriorityThread runnable3 = new PriorityThread("High Priority Thread");

        // Creating threads
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        // Setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

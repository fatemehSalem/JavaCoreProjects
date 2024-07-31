public class ThreadStatesExample {
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        // Thread in NEW state
        Thread thread = new Thread(new RunnableTask(), "DemoThread");
        System.out.println(thread.getName() + " state: " + thread.getState());

        // Start the thread (RUNNABLE state)
        thread.start();
        System.out.println(thread.getName() + " state after start: " + thread.getState());

        // Sleep to allow thread to start and print its state
        Thread.sleep(100);
        System.out.println(thread.getName() + " state while running: " + thread.getState());

        // Create another thread to demonstrate BLOCKED state
        Thread blockedThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " acquired lock");
            }
        }, "BlockedThread");

        synchronized (lock) {
            blockedThread.start();
            Thread.sleep(100); // Ensure blockedThread tries to acquire the lock
            System.out.println(blockedThread.getName() + " state (expected BLOCKED): " + blockedThread.getState());
        }

        // Demonstrate WAITING state
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "WaitingThread");

        synchronized (lock) {
            waitingThread.start();
            Thread.sleep(100); // Ensure waitingThread calls wait()
            System.out.println(waitingThread.getName() + " state (expected WAITING): " + waitingThread.getState());
            lock.notify(); // Wake up the waiting thread
        }

        // Demonstrate TIMED_WAITING state
        Thread timedWaitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(5000); // Wait for 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "TimedWaitingThread");

        synchronized (lock) {
            timedWaitingThread.start();
            Thread.sleep(100); // Ensure timedWaitingThread calls wait with timeout
            System.out.println(timedWaitingThread.getName() + " state (expected TIMED_WAITING): " + timedWaitingThread.getState());
        }

        // Wait for the main thread to finish
        thread.join();
        blockedThread.join();
        waitingThread.join();
        timedWaitingThread.join();

        // Check the state after completion (TERMINATED state)
        System.out.println(thread.getName() + " state after join: " + thread.getState());
        System.out.println(blockedThread.getName() + " state after join: " + blockedThread.getState());
        System.out.println(waitingThread.getName() + " state after join: " + waitingThread.getState());
        System.out.println(timedWaitingThread.getName() + " state after join: " + timedWaitingThread.getState());
    }

    static class RunnableTask implements Runnable {
        @Override
        public void run() {
            // Simulate some work
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is running");
                try {
                    Thread.sleep(500); // Sleep to simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

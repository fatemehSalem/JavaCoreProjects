public class ThreadStatesExample {
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread newThread = new Thread(new RunnableTask(), "NewThread");

        // New state (Thread created but not started)
        System.out.println(newThread.getName() + " state: " + newThread.getState());

        // Start the thread, moving it to Runnable state
        newThread.start();
        System.out.println(newThread.getName() + " state after start: " + newThread.getState());

        // Ensure the thread has started and is in runnable state
        Thread.sleep(100);
        System.out.println(newThread.getName() + " state after sleep: " + newThread.getState());

        // Create a thread to demonstrate Blocked state
        Thread blockedThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " acquired lock");
            }
        }, "BlockedThread");

        synchronized (lock) {
            blockedThread.start();
            // Ensure blockedThread tries to acquire the lock
            Thread.sleep(100);
            System.out.println(blockedThread.getName() + " state: " + blockedThread.getState());
        }

        // Waiting state
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
            // Ensure waitingThread calls wait()
            Thread.sleep(100);
            System.out.println(waitingThread.getName() + " state: " + waitingThread.getState());
            lock.notify();
        }

        // Timed Waiting state
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
            // Ensure timedWaitingThread calls wait with timeout
            Thread.sleep(100);
            System.out.println(timedWaitingThread.getName() + " state: " + timedWaitingThread.getState());
        }

        // Join all threads to ensure they complete
        newThread.join();
        blockedThread.join();
        waitingThread.join();
        timedWaitingThread.join();

        // Terminated state
        System.out.println(newThread.getName() + " state after join: " + newThread.getState());
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
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

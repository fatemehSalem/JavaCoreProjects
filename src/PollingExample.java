public class PollingExample {

    private static volatile boolean resourceAvailable = false;

    public static void main(String[] args) throws InterruptedException {
        Thread workerThread = new Thread(new Worker());
        Thread pollerThread = new Thread(new Poller());
        workerThread.start();
        pollerThread.start();
        // Wait for worker thread to finish
        workerThread.join();
        // Wait for poller thread to finish
        pollerThread.join();
        System.out.println("Main: Both threads have completed");
    }
    static class Worker implements Runnable {
        @Override
        public void run() {
            System.out.println("Worker: Starting task");
            try {
                Thread.sleep(5000);  // Simulate a task taking some time: 5 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            resourceAvailable = true;
            System.out.println("Worker: Task completed");
        }
    }
    static class Poller implements Runnable {
        @Override
        public void run() {
            System.out.println("Poller: Starting polling");
            while (!resourceAvailable) {
                System.out.println("Poller: Resource not available, checking again in 1 second");
                try {
                    Thread.sleep(1000);  // Sleep for 1 second before checking again
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Poller: Resource is now available");
        }
    }
}

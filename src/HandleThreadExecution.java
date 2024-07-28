public class HandleThreadExecution {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);

        threadB.start();

        try {
            // Ensure threadB starts before threadA
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start threadA after threadB has started
        threadA.start();
    }
}

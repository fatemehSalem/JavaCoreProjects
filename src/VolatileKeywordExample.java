public class VolatileKeywordExample {
    private volatile boolean flag = true;
    public void run() {
        while (flag) {
            System.out.println("Thread is working...");
        }
    }
    public void stop() {
        flag = false;
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileKeywordExample example = new VolatileKeywordExample();
        Thread t1 = new Thread(example::run);
        t1.start();
        Thread.sleep(1000);
        example.stop();
        t1.join();
        System.out.println("Thread stopped");

    }
}

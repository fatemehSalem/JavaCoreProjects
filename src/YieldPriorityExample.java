public class YieldPriorityExample {
    public static void main(String[] args) {
        Runnable highPriorityTask = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " with HIGH priority executing.");
                Thread.yield();
            }
        };

        Runnable lowPriorityTask = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " with LOW priority executing.");
                Thread.yield();
            }
        };

        Thread highPriorityThread = new Thread(highPriorityTask, "High-Priority-Thread");
        Thread lowPriorityThread = new Thread(lowPriorityTask, "Low-Priority-Thread");

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        lowPriorityThread.start();
    }
}

public class DeadLockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("thread 1 is working....");
            }
        }
    }
    public void method2() {
        synchronized (lock2) {
            synchronized (lock1) {
                System.out.println("thread 2 is working....");
            }
        }
    }
    public static void main(String[] args) {
        DeadLockExample example = new DeadLockExample();
        Thread t1 = new Thread(example::method1);
        Thread t2 = new Thread(example::method2);
        t1.start();
        t2.start();
    }
}

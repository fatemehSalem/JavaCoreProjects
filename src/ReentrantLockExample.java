import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock();
    public void increment() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }
    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample example = new ReentrantLockExample();

        Thread t1 = new Thread(example::increment);
        Thread t2 = new Thread(example::increment);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: " + example.getCounter());
    }
}

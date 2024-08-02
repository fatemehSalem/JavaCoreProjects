import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private int counter = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    public void increment() {
        lock.writeLock().lock();
        try {
            counter++;
        } finally {
            lock.writeLock().unlock();
        }}
    public int getCounter() {
        lock.readLock().lock();
        try {
            return counter;
        } finally {
            lock.readLock().unlock();
        }}
    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockExample example = new ReadWriteLockExample();

        Thread t1 = new Thread(example::increment);
        Thread t2 = new Thread(example::increment);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Counter: " + example.getCounter());
    }
}

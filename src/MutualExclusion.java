public class MutualExclusion {
    private static int counter = 0;

    private synchronized void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        MutualExclusion mutualExclusion = new MutualExclusion();

        Thread thread1 = new Thread(mutualExclusion::increment);
        Thread thread2 = new Thread(mutualExclusion::increment);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);

    }
}

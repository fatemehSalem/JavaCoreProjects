public class GeneralRun {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadB.setPriority(Thread.MAX_PRIORITY);

        threadA.start();
        threadB.start();
    }
}

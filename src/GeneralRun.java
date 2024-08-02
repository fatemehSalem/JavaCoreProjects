public class GeneralRun {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);

        threadB.start();
        threadA.start();


//        threadB.setPriority(Thread.MAX_PRIORITY);
//        threadA.setPriority(1);
//
//        threadB.start();
//        threadA.start();
    }
}

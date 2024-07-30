public class RaceCondition {
    private static int count = 0;

    private void increment(){
        for(int i = 0 ; i < 100 ; i++)
            count++;
    }

    public static void main(String[] args) throws InterruptedException {
        RaceCondition raceCondition = new RaceCondition();

        Thread t1 = new Thread(raceCondition::increment);
        Thread t2 = new Thread(raceCondition::increment);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count);
    }
}

public class RaceConditionExample {
    private int count = 0;

    public void increment() {
        for(int i = 0 ; i < 10 ; i++)
            count++;
    }
    public int getCount() {
        return count;
    }
    public static void main(String[] args) throws InterruptedException {
        RaceConditionExample example = new RaceConditionExample();
        Thread t1 = new Thread(example::increment);
        Thread t2 = new Thread(example::increment);
        t1.start();
        t2.start();
        System.out.println(example.getCount());
    }
}

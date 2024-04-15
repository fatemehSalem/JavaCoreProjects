public class Counter {
    static int counter;
    public synchronized static void increment(){
        counter++;
    }
}

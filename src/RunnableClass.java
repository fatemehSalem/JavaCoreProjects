
public class RunnableClass {
    public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();
    Runnable classA = () -> {
            for( int i = 1 ; i <= 1000 ; i++){
                c.increment();
            }
    };

    Runnable classB = () -> {
            for( int i = 1 ; i <= 1000 ; i++){
                c.increment();

            }
        };


    Thread t1 = new Thread(classA);
    Thread t2 = new Thread(classB);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

        System.out.println( c.counter);
    }
}

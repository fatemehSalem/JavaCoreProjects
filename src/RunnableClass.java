
public class RunnableClass {
    public static void main(String[] args) throws InterruptedException {
    Runnable classA = () -> {
            for( int i = 1 ; i <= 1000 ; i++){
                Counter.increment();
            }
    };

    Runnable classB = () -> {
            for( int i = 1 ; i <= 1000 ; i++){
                Counter.increment();

            }
        };



    Thread t1 = new Thread(classA);
    Thread t2 = new Thread(classB);

      /*  Runnable t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });*/

/*        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });*/

    t1.start();
    t2.start();

    t1.join();
    t2.join();

        System.out.println(Counter.counter);
    }
}


public class RunnableClass {
    public static void main(String[] args) throws Exception {
    Runnable classA = () -> {
            for( int i = 0 ; i <= 5 ; i++){
                System.out.println("hello from A");
            }
    };

    Runnable classB = () -> {
            for( int i = 0 ; i <= 5 ; i++){
                System.out.println("hello from B");
            }
        };

    Thread t1 = new Thread(classA);
    Thread t2 = new Thread(classB);

    t1.start();
    t2.start();
    }
}

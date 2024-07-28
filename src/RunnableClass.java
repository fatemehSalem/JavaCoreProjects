public class RunnableClass {
    public static void main(String[] args)
    {
        Runnable runnableA = () -> {
            for(int i = 0; i<= 10 ; i++)
                System.out.println("My Thread A");
        };
        Runnable runnableB = () -> {
            for(int i = 0; i<= 10 ; i++)
                System.out.println("My Thread B");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

    }
}



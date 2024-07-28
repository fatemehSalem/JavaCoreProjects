public class ThreadB extends Thread{
    public void run(){
        for(int i = 0; i<= 5 ; i++){
            System.out.println("B");
            try {
                Thread.sleep(10);
            } catch (Exception ignored){

            }
        }

        /*for(int i = 0; i<= 5 ; i++)
            System.out.println("B");*/
    }
}

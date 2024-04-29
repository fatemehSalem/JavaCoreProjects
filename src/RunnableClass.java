
import java.util.ArrayList;

public class RunnableClass {


    public static int numberOfPair(int[] x, int[] y ) {
        int count = 0;
        for( int i : x){
            for( int j : y){
                if( Math.pow( i ,j ) > Math.pow(j ,i ) ){
                    count ++;
                }
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        int[] x = {2 , 3 , 4 , 5};
        int[] y = {1 , 2 , 3};
        int result = numberOfPair(x , y);
        System.out.println("number of pairs is: " + result);
    }
}



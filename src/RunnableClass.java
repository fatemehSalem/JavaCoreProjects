
import java.util.ArrayList;

public class RunnableClass {


    public static ArrayList<Integer> reArrangeArray(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        int length = arr.length;
        int count = 0;
        while(count <= (length / 2) ){
            if( (length - count - 1) != count)
                lst.add(arr[length - count - 1 ]);
                lst.add(arr[count]);
            count ++;
        }

        return lst;
    }
    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };

        ArrayList<Integer> result = reArrangeArray(arr);
        System.out.println("rearrange array is: " + result);
    }
}


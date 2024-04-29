import java.util.ArrayList;

public class RunnableClass {


    public static ArrayList<Integer> sort(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();

            for(int i : arr){
                if(i == 0)
                    lst.add(i);
            }

            for(int i : arr){
                if(i == 1)
                    lst.add(i);
            }

            for(int i : arr){
                if(i == 2)
                    lst.add(i);
            }
        return  lst;
    }
    public static void main(String[] args) {
        int[] x = {0 , 2 , 1 , 2 , 0};
        ArrayList<Integer> result = sort(x );
        System.out.println("number of pairs is: " + result);
    }

}



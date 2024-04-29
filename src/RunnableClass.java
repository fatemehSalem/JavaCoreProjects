import java.util.ArrayList;

public class RunnableClass {


    public static ArrayList<Integer> findLeaders(int[] arr) {
       ArrayList<Integer> arrayList = new ArrayList<>();
       int count;

       for(int i = 0 ; i < arr.length ; i++){
           count = 0;
           if(i == arr.length - 1)
               arrayList.add(arr[i]);
           for( int j = i + 1 ; j < arr.length  ; j++){
               if( arr[i] > arr[j]){
                   count ++;
                   if(count == arr.length - 1 - i)
                       arrayList.add(arr[i]);
               } else
                   break;
           }
       }
       return arrayList;
    }
    public static void main(String[] args) {
        int[] x = {16 , 17 , 4 , 3 , 5 , 2};
        System.out.println("leaders are: " + findLeaders(x ));
    }

}



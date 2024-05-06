public class RunnableClass {
    public static int findLastIndex(int[] arr) {
        int n = arr.length, index = -1 ;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 1)
                index  = i;
        }
       return index;
    }

    public static void main(String[] args) {
        int[] arr = {0 , 0 , 4 , 1 , 6 , 0 , 0 , 1};
        System.out.println("Last index of 1 is: "  + findLastIndex(arr));
    }

}




public class RunnableClass {
    public static String findIndexes(int[] arr , int s){
        String result;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
           for(int j = i + 1 ; j < arr.length ; j++){
               if(j == i + 1)
                    sum = sum + arr[i] + arr[j];
               else
                   sum = sum + arr[j];
               if(sum > s)
                   break;
               else if(sum == s){
                   result =(i + 1) + "" + (j + 1) + "";
                   return result;
               }
           }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int s = 15;
        String result = findIndexes(arr , s);
        if(result != null)
            System.out.println("The sum of elements from " + result.charAt(0) + "st position to " + result.charAt(1) + "st position");
        else
            System.out.println("The result has not been found!");
    }
}

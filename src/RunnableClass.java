import java.util.Arrays;

public class RunnableClass {
    public static boolean isPythagoreanTriplet(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            if(i != arr.length - 1){
                int target = arr[i] + arr[i+1];
                if(binarySearch(arr , target) != -1){
                    return true;
                }
            }

        }
        return false;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {20, 2, 4, 6, 5 , 12 , 99 , 101};
        System.out.println("Is there a Pythagorean triplet? "  + isPythagoreanTriplet(arr));
    }

}



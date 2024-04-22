

public class RunnableClass {
    public static void main(String[] args) {
        int[] nums = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int target = 100;

       // int result2 = linearSearch(nums , target);
        int result1 = binarySearch(nums , target , 0 , nums.length - 1);

      if(result1 != -1)
            System.out.println("Element found at Index: " + result1);
        else
            System.out.println("Element not found!");
    }
/*    public static int[] createRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }*/

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i = 0 ; i < nums.length ; i++){
            steps ++;
            if(nums[i] == target){
                System.out.println("Steps taken by Linear: " + steps);
                return i;
            }

        }
        System.out.println("Steps taken by Linear: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target , int left , int right) {
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){

                return mid;
            } else if(nums[mid] < target){
                left = mid + 1;
                binarySearch(nums , target , left , right);
            } else{
                right = mid - 1;
                binarySearch(nums , target , left , right);
            }

        }
        return -1;
    }
}



public class RunnableClass {
    public static void main(String[] args) {
        int[] nums = new int[32];
        int target = 900;

        int result2 = linearSearch(nums , target);
        int result1 = binarySearch(nums , target);


     /*   if(result1 != -1)
            System.out.println("Element found at Index: " + result1);
        else
            System.out.println("Element not found!");*/
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

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while(left <= right){
            steps ++;
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                System.out.println("Steps taken by Binary: " + steps);
                return mid;
            } else if(nums[mid] < target)
                left = mid + 1;
              else
                right = mid - 1;
        }
        System.out.println("Steps taken by Binary: " + steps);
        return -1;
    }
}

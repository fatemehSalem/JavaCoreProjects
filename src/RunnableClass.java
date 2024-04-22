

public class RunnableClass {
    public static void main(String[] args) {
        int[] nums = {10, 11, 12, 14, 18, 20, 28, 34};
        int target = 2121;

        int result = linearSearch(nums , target);

        if(result != -1)
            System.out.println("Element found at Index: " + result);
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
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}

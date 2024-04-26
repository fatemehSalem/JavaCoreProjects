

public class RunnableClass {
    public static void main(String[] args) {
        int[] nums = {2 , 5 , 4 , 11 , 1 , 7 , 10 , 13 , 12};

        System.out.println("before sorting:");
        for(int num : nums)
            System.out.print(num + " ");

        int[] sortedNums = selectionSort(nums);
        System.out.println();
        System.out.println("after sorting:");
        for(int s : sortedNums)
            System.out.print(s + " ");
    }
    public static int[]  selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            // for (int i = arr.length - 1; i >= 0; i--) { //Find the index of the maximum element
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) { //find the minimum element, sort from lower to upper , ASC
               // if (nums[j] > nums[minIndex]) { //sort from upper to lower, DESC
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return nums;
    }
}



public class RunnableClass {
    public static void main(String[] args) {
        int[] nums = {2 , 5 , 4 , 11 , 1 , 7 , 10 , 13 , 12};
        int temp;

        System.out.println("before sorting:");
        for(int num : nums)
            System.out.print(num + " ");

        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0 ; j < nums.length - 1 ; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting:");
        for(int num : nums)
            System.out.print(num + " ");
    }

}

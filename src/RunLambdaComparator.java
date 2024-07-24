import java.util.*;

public class RunLambdaComparator {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11 , 2 , 15 , 25 , 1);
        nums.sort(Comparator.reverseOrder());
        for(Integer i : nums)
            System.out.println(i);

        System.out.println("************************");

        Integer[] nums2 = {10, 9, 21, 7, 19};
        Arrays.sort(nums2 , Comparator.naturalOrder());
        for(Integer i : nums2)
            System.out.println(i);
    }
}

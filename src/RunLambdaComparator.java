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

        System.out.println("************************");
        //sort an array based on a custom condition where the sorting depends on
        // whether the sum of two numbers is greater than twice their difference:

        List<Integer> myNums = Arrays.asList( 25 , 1 , 41 , 29 , 10 , 19);
        myNums.sort((o1 , o2) ->{
            int sum = o1 + o2;
            int diff = 2 * (o1 - o2);
            return Integer.compare(diff , sum);
        });

        for(Integer i : myNums)
            System.out.println(i);
    }
}

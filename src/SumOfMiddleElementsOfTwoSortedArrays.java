import java.util.Arrays;

public class SumOfMiddleElementsOfTwoSortedArrays {
    public static int sumOfMiddleElements(int[] arr1, int[] arr2) {
        int[] mergedArray = MergedTwoArrays.mergedArray(arr1,arr2);
        int mid1 = (arr1.length + arr2.length) / 2 - 1;
        int mid2 = (arr1.length + arr2.length) / 2;

        return mergedArray[mid1] + mergedArray[mid2];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 10 , 11};
        int[] arr2 = {4, 5, 6, 9, 12 , 13};

        int result = sumOfMiddleElements(arr1, arr2);
        System.out.println("Sum of middle elements: " + result); // Output should be 11
    }

}

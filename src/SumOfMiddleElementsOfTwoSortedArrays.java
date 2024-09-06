import java.util.Arrays;

public class SumOfMiddleElementsOfTwoSortedArrays {
    public static int sumOfMiddleElements(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m];
        int i = 0, j = 0, k = 0;
        //merge two arrays with sorted approach
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        int mid1 = (n + m) / 2 - 1;
        int mid2 = (n + m) / 2;

        return mergedArray[mid1] + mergedArray[mid2];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 10 , 11};
        int[] arr2 = {4, 5, 6, 9, 12 , 13};

        int result = sumOfMiddleElements(arr1, arr2);
        System.out.println("Sum of middle elements: " + result); // Output should be 11
    }

}

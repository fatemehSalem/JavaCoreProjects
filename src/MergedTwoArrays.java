public class MergedTwoArrays {
    public static int[] mergedArray(int[] arr1, int[] arr2){
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
        return mergedArray;
    }
}

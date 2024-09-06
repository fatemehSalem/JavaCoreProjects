public class find_K_th_element_of_two_Arrays {
    public static int find_K_th_element_of_two_Arrays(int[] arr1, int[] arr2 , int k) {
        int[] mergedArray = MergedTwoArrays.mergedArray(arr1 , arr2);
        return mergedArray[k - 1];
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        System.out.println(find_K_th_element_of_two_Arrays(arr1 , arr2 , 7));
    }
}

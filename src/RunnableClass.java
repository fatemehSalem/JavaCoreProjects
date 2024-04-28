import java.util.ArrayList;

public class RunnableClass {
    public static ArrayList<Integer> findSubarray(int[] A, int S) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = 0;
        int sum = 0;

        while (right < A.length) {
            sum += A[right];

            while (sum > S) {
                sum -= A[left];
                left++;
            }

            if (sum == S) {
                result.add(left + 1); // Adjusting to 1-based indexing
                result.add(right + 1); // Adjusting to 1-based indexing
                return result;
            }


            right++;
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 20, 3, 10, 5};
        int S = 33;

        ArrayList<Integer> result = findSubarray(A, S);
        System.out.println(result);
    }

}

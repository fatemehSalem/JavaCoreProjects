public class FindTheElementThatAppearsOnceInSortedArray {
    static int  findOnce(int arr[])
    {
        int low = 0, high = (arr.length) - 1;
        while (low < high)
        {
            int mid = (low + high) / 2;

            // If mid is even and element next to mid is
            // same as mid, then output element lies on
            // right side, else on left side
            if (mid%2 == 0)
            {
                if (arr[mid] == arr[mid+1])
                    low = mid + 2;
                else
                    high = mid;
            }
            else  // If mid is odd
            {
                if (arr[mid] == arr[mid-1])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {1 , 1 , 2 , 2, 3 , 3, 4 , 5 , 5, 6, 6};
        int result =  findOnce(arr);
        System.out.println(result);
    }
}

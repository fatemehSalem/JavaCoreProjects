public class RunnableClass {


    public static int findEquilibriumPoint(int[] arr, int minIndex ) {
        int sum1 = 0,sum2 = 0;
        for(int i = 0 ; i < minIndex ; i ++)
            sum1 = sum1 + arr[i];
        for(int j = minIndex + 1 ; j < arr.length ; j ++)
            sum2 = sum2 + arr[j];

        if(sum1 == sum2)
            return minIndex;
        else {
            if(sum1 < sum2)
                minIndex ++;
            else
                minIndex --;

            return findEquilibriumPoint(arr , minIndex );
        }
    }
    public static void main(String[] args) {
        int[] x = {1 , 3 , 2 , 4 , 9 , 10};
        System.out.println("Equilibrium Point is: " + findEquilibriumPoint(x, x.length /2 ));
    }

}



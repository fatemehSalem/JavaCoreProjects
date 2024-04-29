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
            if(minIndex == arr.length -1)
                return  0;
            if(minIndex < arr.length && minIndex > 0){
                if(sum1 < sum2)
                    minIndex ++;
                else
                    minIndex --;

                return findEquilibriumPoint(arr , minIndex );
            }
        }
        return  0;
    }
    public static void main(String[] args) {
        int[] x = {1 , 3 , 5 , 8 , 9};
        System.out.println("Equilibrium Point is: " + findEquilibriumPoint(x, x.length /2 ));
    }

}



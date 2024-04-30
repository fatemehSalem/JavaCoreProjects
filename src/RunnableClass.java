import java.util.ArrayList;
import java.util.Arrays;

public class RunnableClass {

    public static int findMinimumPlatforms(double[] arrival, double[] departure) {
        int n = arrival.length;

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformNeeded = 1;
        int maxPlatforms = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] < departure[j]) {
                platformNeeded++;
                i++;
            } else {
                platformNeeded--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platformNeeded);
        }
        return maxPlatforms;
    }

    public static void main(String[] args) {
        double[] arrival = {10.00, 10.30, 11.00, 11.30, 12.00};
        double[] departure = {10.20, 11.20, 12.10, 12.30, 13.00};

        int minPlatforms = findMinimumPlatforms(arrival, departure);
        System.out.println("Minimum number of platforms is: " + minPlatforms);
    }

}



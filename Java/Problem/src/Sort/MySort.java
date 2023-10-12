package Sort;
import Generated.NumberRange.RandomIntArray;
import java.util.Arrays;

public class MySort {
    // Test run
    public static void main(String[] args) {

        int[][] test = {
            {}, // Empty List
            {0}, // Single List
            {0,0,0}, // Identical List
            {9,8,7,6,5,4,3,2,1}, // Reverse List
            {1,3,2,4,5,6,7}, // Chaos List
            RandomIntArray.Range(0, 2000, 2000) // Large List @see Generated\NumberRange\RandomIntArray.java
        };  

        for (int[] arr : test) {
            System.out.println(Arrays.toString(Sort.decreasing(arr)));
        }
    }
}

class Sort{
    // Time complexity: O(n!)
    public static int[] ascending(int[] arr) {
        while (true) {
            int track = 0;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    // Swap two numbers:
                    arr[i-1] = arr[i-1] + arr[i];
                    arr[i] = arr[i-1] - arr[i];
                    arr[i-1] = arr[i-1] - arr[i];
                    // Keep track of swapping:
                    track++;
                }
            }

            if (track == 0) {
                break;
            }
        }

        return arr;
    }

    public static int[] decreasing(int[] arr) {

        while (true) {
            int track = 0;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] < arr[i]) {
                    // Swap two numbers:
                    arr[i-1] = arr[i-1] + arr[i];
                    arr[i] = arr[i-1] - arr[i];
                    arr[i-1] = arr[i-1] - arr[i];
                    // Keep track of swapping:
                    track++;
                }
            }

            if (track == 0) {
                break;
            }
        }

        return arr;
    }
}

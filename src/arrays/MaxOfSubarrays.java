package arrays;

import java.util.Arrays;

public class MaxOfSubarrays {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6,7};
        int k = 3;
        getMaxForSubarray(arr, k);
    }

    static void getMaxForSubarray(int[] arr, int k) {
        for (int i = 0; i <arr.length-(k-1); i++) {
            int max = Integer.MIN_VALUE;
            int[] a = Arrays.copyOfRange(arr, i, i+k);
            for (int j = 0; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            System.out.println(max);
        }
    }
}

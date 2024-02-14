package arrays;

import java.util.ArrayList;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] a = {-2, -3, -4, -1, -2, -1, -5, -3};
        int[] a1 = {9};
        System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(a));
    }


    static int maxSubArraySum(int[] a) {
        if (a.length == 1) {
            return a[0];
        } else if (a.length == 0) {
            return -1;
        }
        int maxend = 0, totalmax = Integer.MIN_VALUE;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            maxend = maxend + a[i];
            if (maxend > totalmax) {
                totalmax = maxend;
            }
            if (maxend < 0) {
                maxend = 0;
            }
        }
        return totalmax;

    }
}








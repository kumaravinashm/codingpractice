package arrays;

import java.util.ArrayList;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] a = {-2, -3, -4, -1, -2, -1, -5, -3};
        int[] a1 = {9};
        plusOne(a1);
//        System.out.println("Maximum contiguous sum is "
//                + maxSubArraySum(a));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1]+1> 9 && digits[n-1]< 100){
            int[] digits1 = new int[n + 1];
            System.arraycopy(digits, 0, digits1, 0, digits.length);
            int i = digits[n-1]+1;
            digits1[n-1] = i / 10;
            digits1[n] = i % 10;
            return digits1;
        }
        else{
            digits[n-1] = digits[n-1]+1;
        }
        return digits;
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








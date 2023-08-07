package arrays;

import java.util.Arrays;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1, -2, -3, 0, 7, -8, -2},7));
    }

    static long maxProduct(int[] arr, int n) {
        long maxProduct = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            long tempProduct = 1;
            for(int j=i;j<n;j++){
                tempProduct*=arr[j];
                if(tempProduct>maxProduct){
                    maxProduct = tempProduct;
                }
            }
        }
        return maxProduct;
    }
}

//NEEDS to be done
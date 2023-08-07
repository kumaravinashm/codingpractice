package arrays;

import java.lang.reflect.Array;

public class LargestInList {
    static int largest(int[] arr) {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    public static int[] getSortedArray(int[] arr, int total) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        return arr;
    }

    public static int getSecondLargest(int[] a, int total){
        int []b = getSortedArray(a,total);
        return b[total-2];
    }



    // Driver code
    public static void main(String[] args) {
        int arr[] = {4, 8, 5,9, 7,10,5,7,3};
        System.out.println("Largest in given array is " + largest(arr));
        System.out.println(getSecondLargest(arr,arr.length));
        getThreeLarest(arr,arr.length);
    }

    private static void getThreeLarest(int[] a, int total) {
        int []b = getSortedArray(a,total);
        System.out.println(
                "first "+b[total-1] +" second "+b[total-2] +" third "+b[total-3]
        );
    }
}

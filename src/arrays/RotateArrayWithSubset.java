package arrays;

public class RotateArrayWithSubset {

    static void reverse(int[] arr, int n, int k)
    {
        for(int i=0;i<n;i+=k){
            int left = i;
            int right = Math.min(i+k-1,n-1);
            int temp;
            while(left<right){
                temp = arr[right];
                arr[right]=arr[left];
                arr[left] = temp;
                right--;
                left++;
            }
        }
    }

    // Driver method
    public static void main(String[] args)
    {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,9};
        int k = 3;

        int n = arr.length;

        reverse(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

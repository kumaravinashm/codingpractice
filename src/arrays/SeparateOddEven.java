package arrays;

public class SeparateOddEven {
    static int[] arrayEvenAndOdd(int arr[], int n) {
        int i=-1,j=0;
        while(j!=n){
            if(arr[j]%2==0){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        return arr;
    }
    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 4, 7, 6, 9, 10};
        int n = arr.length;
        int arrb[] = arrayEvenAndOdd(arr, n);
        for (int k = 0; k < n; k++)
            System.out.print(arrb[k] + " ");
    }
}

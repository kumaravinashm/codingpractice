package arrays;

public class SecondLargestInArray {


    public static void main(String[] args) {
        int arr[] = {1,8, 2, 3, 4, 5, 6, 7, 8,9,8};
        System.out.printf("Second largest in array = "+findSecond(arr,arr.length));
    }

    static int findSecond(int[] arr,int n ){
        int largest,secondlargest,third;
        largest=secondlargest=third=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(largest<arr[i]){
                third = secondlargest;
                secondlargest = largest;
                largest = arr[i];
            } else if (secondlargest<arr[i]) {
                third = secondlargest;
                secondlargest = arr[i];
            }
            else if (third<arr[i]) {
                third = arr[i];
            }
        }
        return secondlargest;
    }
}

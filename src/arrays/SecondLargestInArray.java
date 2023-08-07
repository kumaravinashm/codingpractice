package arrays;

public class SecondLargestInArray {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,9};
        System.out.printf("Second largest in array = "+findSecond(arr,arr.length));
    }

    static int findSecond(int[] arr,int n ){
        int largest,secondlargest;
        largest=secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp;
            if(secondlargest<arr[i]){
                secondlargest=arr[i];
                if(secondlargest>largest){
                    temp = largest;
                    largest = secondlargest;
                    secondlargest = temp;
                }
            }
        }
        return secondlargest;
    }
}

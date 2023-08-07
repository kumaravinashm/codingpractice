package arrays;

public class ThreeGreatestNumber {
    public static void main(String[] args) {
        int arr[] = {4, 8, 5,9, 7,10,5,7,3};
        largest3(arr);
    }

    static void largest3(int[] arr){
        if(arr.length<3) {
            System.out.print(" Invalid Input ");
            return;
        }
        int i,first,second,third;
        first=second=third=Integer.MIN_VALUE;
        for(i=0;i<=arr.length-1;i++){
            if(arr[i]>first){
                third = second;
                second= first;
                first = arr[i];
            } else if (arr[i]>second) {
                third = second;
                second= arr[i];
            }
            else if (arr[i]>third) {
                third = arr[i];
            }
        }
        System.out.println(first+" "+second+" ");
        System.out.println(first*second);

        }
}

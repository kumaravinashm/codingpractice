package arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1,2,3,5,6},5));
    }


    static int missingNumber(int array[], int n) {
        // Your Code Here
        int sumOfn = 0;
        int arraySum = 0;
        sumOfn = (n*(n+1))/2;
        for(int a:array){
            arraySum = arraySum + a;
        }
        return sumOfn-arraySum;

    }
}

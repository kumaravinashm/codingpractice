package Logical;

public class SumOFDigits {
    public static void main(String[] args) {
        System.out.println(getSum(23234199));
    }

    static int getSum(int n){
       int sum = 0;
       while (n!=0){
           sum = sum+n%10;
           n=n/10;
       }
       return sum;
    }
}

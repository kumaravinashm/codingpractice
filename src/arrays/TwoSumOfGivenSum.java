package arrays;

public class TwoSumOfGivenSum {

    public static void main(String[] args)
    {

        int A[] = { 0, -1, 2, -3, 1 };
        int x = -2;
        int size = A.length;

        if (chkPair(A, size, x)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    static boolean chkPair(int[] a,int  n,int comp){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==comp){
                    return true;
                }
            }
        }
        return false;
    }
}

package integers;


public class ReverseInteger {


    public static void main(String[] args) {
        int a= 5432;
        System.out.println(revnum(a));
    }

    static long revnum(int n){
        long rev = 0l;
        while (n!=0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        return (int) (long) rev;
    }
}


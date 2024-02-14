package integers;


public class ReverseInteger {


    public static void main(String[] args) {
        int a= 5432;
        System.out.println(revnum(a));
    }

    static long revnum(int n){
        int rev = 0;
        int temp = n;
        while (temp>0){
            int last = temp%10;
            rev = rev*10+last;
            temp = temp/10;
        }
        return rev;
    }
}


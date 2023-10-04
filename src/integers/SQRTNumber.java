package integers;

public class SQRTNumber {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));

    }
    static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int result =1,i=46335;
        while(result<=x){
            if(result<0){
                return i-1;
            }
            i++;
            result = i*i;
        }
        return i-1;

    }
}

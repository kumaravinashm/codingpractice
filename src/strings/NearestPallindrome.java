package strings;

public class NearestPallindrome {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(getNearestPallindrome(n));
    }


    static int getNearestPallindrome(int n)
    {
        int badanum = n+1;
        while(!CheckPallindrome.isPalindrome(String.valueOf(badanum))){
            badanum++;
        }
        int chotanum = n-1;
        while(!CheckPallindrome.isPalindrome(String.valueOf(chotanum))){
            chotanum--;
        }
        if (Math.abs(n - badanum) < Math.abs(n - chotanum)) {
            return  (badanum);
        }
        else
            return (chotanum);

    }
}

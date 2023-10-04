package integers;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }


    static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (rev == n); // if it is true then it will return 1;

    }
}

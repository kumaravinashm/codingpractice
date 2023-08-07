package strings;

public class CheckPallindrome {
    public static void main(String[] args) {
        isPalindrome("asddsa");
    }


    static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    static Object reverseString(String s){
        String str = "";
        char[] arr= s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            str = str + arr[i];
        }
        return str;
    }



}

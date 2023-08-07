package strings;

public class LongestPallindromeSentence {
    public static void main(String[] args) {
        String s = new String("My name is ava and i lovevol Geeksforgeeks");
        System.out.println(getLongestPallinWord(s));
    }



    static String getLongestPallinWord(String str){
        String longest = "";
        int length = 0;
        String[] s = str.split("\\s+");
        for(String c:s){
            if(CheckPallindrome.isPalindrome(c) && c.length()>length){
                length = c.length();
                longest = c;
            }
        }
        return longest;
    }
}

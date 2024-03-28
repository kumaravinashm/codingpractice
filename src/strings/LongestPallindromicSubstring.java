package strings;

import java.util.ArrayList;
import java.util.List;

public class LongestPallindromicSubstring {


    public static void main(String[] args) {
        String s=" ";
        System.out.println(longestPalindrome(s));
    }


    public static boolean longestPalindrome(String a) {
        String s = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++) {
            //Check even len palindromes
            int left = i, right = i;
            //check pallindrome
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                //check the current lenth is greater than the result or not
                if(end-start < right-left) {
                    end = right;
                    start = left;
                }
                left--;
                right++;
            }
//            Check odd len palindromes
            left = i;
            right = i+1;
            //check pallindrome
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                //check the current lenth is greater than the result or not
                if(end-start < right-left) {
                    end = right;
                    start = left;
                }
                left--;
                right++;
            }
        }
        if(s.length()==0){
            return true;
        }
        else if(start==0 && end==s.length()-1){
            return true;
        }else{
            return false;
        }
    }
}

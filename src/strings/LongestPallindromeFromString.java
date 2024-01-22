package strings;

import java.util.HashMap;

public class LongestPallindromeFromString {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(map.get(temp) != null) map.remove(temp);
            else map.put(temp, i);
        }
        if(map.size() <= 1) return s.length();
        return s.length() - map.size() + 1;
    }
}

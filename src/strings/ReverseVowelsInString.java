package strings;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowel(s));
    }

    static String reverseVowel(String s){
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');
        char[] carr = s.toCharArray();
        int left=0,right=s.length()-1;
        while (left<right){
            if(vowels.contains(carr[left])){
                if(vowels.contains(carr[right])){
                    char temp = carr[left];
                    carr[left] = carr[right];
                    carr[right] = temp;
                    right--;
                    left++;
                }else {
                    right--;
                }
            }else {
                left++;
            }
        }
        return s=String.valueOf(carr);
    }

}

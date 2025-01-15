package src.strings;

import java.util.HashSet;
import java.util.Set;

public class MorseCode {
    public static void main(String[] args) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char ch = 'a';
        int pos = ch - 'a';
        System.out.println(
        uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));

    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> st = new HashSet<>();
        for(String s: words){
            String word = "";
            for(char c: s.toCharArray()){
                word = word + codes[c - 'a'];
            }
            st.add(word);
        }
        return st.size();



    }
}

package strings;

import java.util.HashMap;

public class CharOccurences {
    public static void main(String[] args) {
        String s = "halanfhnnngjfyfygyeuwhgguhdwkjdfkwdf";
        char c = 'f';
        System.out.println(charcterOccur(s, c));
    }

    static int charcterOccur(String s, char c) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : chars) {
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                mp.put(ch, (mp.get(ch) + 1));
            }
        }
        return mp.get(c);
    }

}

package strings;

import java.util.HashMap;
import java.util.Map;

public class FindWordsCanBeFormedByCharacters {

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> m1 = getMap(chars);
        int total = 0;
        boolean b;
        for (String s : words) {
            if (chars.length() < s.length()) {
                break;
            }
            b = true;
            HashMap<Character, Integer> m2 = getMap(s);
            for (Map.Entry<Character, Integer> m : m2.entrySet()) {
                if (m1.containsKey(m.getKey())) {
                    if (!(m.getValue() <= m1.get(m.getKey()))) {
                        break;
                    }
                } else {
                    b=false;
                    break;
                }
            }
            if (b==true)total = total + s.length();

        }
        return total;
    }

    static HashMap<Character, Integer> getMap(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        return m;
    }
}

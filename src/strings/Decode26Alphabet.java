package strings;

import java.util.HashMap;

public class Decode26Alphabet {
    public static void main(String[] args) {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        System.out.println(getMessage(key, message));
    }

    static String getMessage(String key, String message) {
        key = key.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Character> mp = new HashMap<>();
        char c = 'a';
        for (char a : key.toCharArray()) {
            if (!mp.containsKey(a)) {
                mp.put(a, c++);
            }
        }
        for (char a : message.toCharArray()) {
            if (mp.containsKey(a)) sb.append(mp.get(a));
            else {
                sb.append(a);
            }

        }
        return sb.toString();

    }
}

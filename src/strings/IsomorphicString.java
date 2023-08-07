package strings;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 = "ayyrr";
        String s2 = "suuff";
        System.out.println(checkIsomorphic(s1, s2));
    }

    static boolean checkIsomorphic(String str1, String str2) {

        HashMap<Character, Character> ch = new HashMap();
        char c = 'a';
        for(int i=0;i<str1.length();i++){
            if(ch.containsKey(str1.charAt(i))){
                c = ch.get(str1.charAt(i));
                if (c!=ch.get(str1.charAt(i))) return false;
            } else if (!ch.containsValue(str2.charAt(i))) {
                ch.put(str1.charAt(i),str2.charAt(i));
            }
            else return false;
        }
        return true;
    }
}

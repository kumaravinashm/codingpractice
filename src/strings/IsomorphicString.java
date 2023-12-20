package strings;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 = "badc";
        String s2 = "baba";
        System.out.println(checkIsomorphic(s1, s2));
    }

    static boolean checkIsomorphic(String str1, String str2) {
        if(str1.length()!=str2.length()) return false;
        HashMap<Character, Character> map
                = new HashMap();
        char character = 'a';
        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                character=map.get(str1.charAt(i));
                if(character!=str2.charAt(i)) return false;
            }else if(!map.containsKey(str1.charAt(i))){
                if(map.containsValue(str2.charAt(i))){
                    return false;
                }
                map.put(str1.charAt(i),str2.charAt(i));
            }
        }
        return true;
    }
}

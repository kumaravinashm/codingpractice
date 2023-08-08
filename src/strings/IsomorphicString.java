package strings;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 = "ayyrr";
        String s2 = "suuff";
        System.out.println(checkIsomorphic(s1, s2));
    }

    static boolean checkIsomorphic(String str1, String str2) {

        HashMap<Character,Character> charr = new HashMap<>();
        char c = 'a';
        for(int i=0;i<charr.size();i++){
            if(charr.containsKey(str1.charAt(i))){
                c=charr.get(str1.charAt(i));
                if(c!=str2.charAt(1)) return false;

            }else if(!charr.containsValue(str2.charAt(i))){
                charr.put(str1.charAt(i),str2.charAt(i));
            }else return false;
        }return true;


    }
}

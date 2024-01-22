package strings;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }


    static boolean wordPattern(String pattern,String s){
        char[] c=pattern.toCharArray();
        String[] sarr = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        if(sarr.length==c.length){
            for(int i=0;i<sarr.length;i++){
                if(map.containsKey(c[i])){
                    if(!map.get(c[i]).equals(sarr[i])) return false;
                }else if(!map.containsKey(c[i])){
                    if(map.containsValue(sarr[i])){
                        return false;
                    }else {
                        map.put(c[i],sarr[i]);
                    }
                }
            }

        }else{
            return false;
        }
        return true;
    }
}

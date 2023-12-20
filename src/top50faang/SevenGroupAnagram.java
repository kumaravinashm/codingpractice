package top50faang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SevenGroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));
    }

    static List<List<String>> groupAnagram(String[] str){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: str){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String s1 = String.valueOf(ch);
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(s);
        }


        return new ArrayList<>(map.values());
    }
}

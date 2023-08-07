package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LongestDistinctcharacters {
    public static void main(String[] args) {
        System.out.println(longestSubstrDistinctChars("aewergrththy"));
    }


    static int longestSubstrDistinctChars(String s){
        // code here
//        HashSet<Character> set = new HashSet<>();
//        ArrayList<Integer> value = new ArrayList<>();
//        char[] arr= S.toCharArray();
//
//        for(char c : arr){
//            if(!set.contains(c)){
//                set.add(c);
//            }else{
//                value.add(set.size());
//                set.clear();
//                set.add(c);
//            }
//        }
//        if(set.size()==S.length()){
//            return S.length();
//        }else {
//            return Collections.max(value);
//        }
        StringBuilder str = new StringBuilder();
        int len = s.length(),res=0;
        for(int i=0;i<len;i++){
            str.append(s.charAt(i));
            for(int j=str.length()-2;j>=0;j--){
                if(str.charAt(j)==s.charAt(i)){
                    str.delete(0,j+1);
                    break;
                }
            }
            res=Math.max(res,str.length());
        }
        return res;
    }
}

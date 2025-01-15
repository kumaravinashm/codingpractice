package strings;

import java.util.HashMap;
import java.util.HashSet;

public class MaxCommonWord {

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph,banned));
    }


    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W+");
        HashMap<String,Integer> maps = new HashMap<>();
        for(String s:words){
            if(maps.containsKey(s)){
                maps.put(s,maps.get(s)+1);
            }else{
                maps.put(s,1);
            }
        }
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        int max = 0 ;
        String result = "";
        for(int i=0;i< words.length;i++){
            if(!set.contains(words[i])){
                if(maps.get(words[i])>max){
                    max=maps.get(words[i]);
                    result = words[i];
                }
            }
        }
        return result;

    }
}

package strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord {
    public static void main(String[] args) {
        String[] sArr = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa", "bbb"};
        mostRepeated(sArr);
    }

    static void mostRepeated(String[] arr){
        HashMap<String,Integer> dict = new HashMap<>();
        for (String w:arr) {
            if(!dict.containsKey(w)){
                dict.put(w,1);
            }
            else{
                dict.put(w,dict.get(w)+1);
            }
        }
        int max = Collections.max(dict.values());
        for (Map.Entry<String,Integer> m :dict.entrySet()) {
            if(m.getValue()==max){
                System.out.println(m.getKey());
            }
        }
    }
}

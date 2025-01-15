package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int n=0;
        char[] cha=stones.toCharArray();
        HashSet<Character> jew = new HashSet<>();
        for(char c:jewels.toCharArray()){
            jew.add(c);
        }
        for(char c:jew){
            for(char b:cha){
                if(c==b){
                    n=n+1;
                }
            }
        }
        return n;

    }
}

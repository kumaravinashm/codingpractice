package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1="asdfghjklt",s2="lkjhgfdsya";
        System.out.println(checkAnagram(s1,s1.length(),s2,s2.length()));
    }

    static boolean checkAnagram(String s1,int n1,String s2,int n2){
        if(n1!=n2){
            return false;
        }
        int totalChars = 256;
        int[] a1 = new int[totalChars];
        int[] a2 = new int[totalChars];
        Arrays.fill(a1,0);
        Arrays.fill(a2,0);

        for(int i=0;i<n1;i++){
            a1[s1.charAt(i)]++;
            a2[s2.charAt(i)]++;
        }

        for(int i=0;i<256;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }
}

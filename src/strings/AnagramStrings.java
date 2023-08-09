package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1="asdfghjkl",s2="lkjhgfdsa";
        System.out.println(checkAnagram(s1,s1.length(),s2,s2.length()));
    }

    static boolean checkAnagram(String s1,int n1,String s2,int n2){
        if(n1!=n2){
            return false;
        }
        int total_Character = 256;
        int[] a1 = new int[total_Character];
        Arrays.fill(a1,0);
        int[] a2 = new int[total_Character];
        Arrays.fill(a2,0);

        for(int i=0;i<n1;i++){
            a1[s1.charAt(i)]++;
            a2[s2.charAt(i)]++;
        }

        for(int i=0;i<total_Character;i++){
            if(a1[i]!=a2[i]) return false;
        }
        return true;
    }
}

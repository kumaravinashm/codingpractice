package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1="anagramq",s2="nagaramq";
        System.out.println(checkAnagram(s1,s1.length(),s2,s2.length()));
    }

    static boolean checkAnagram(String s1,int n1,String s2,int n2){
        int[] a=new int[256];
        int[] b=new int[256];
        Arrays.fill(a,0);
        Arrays.fill(b,0);
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        if(n1==n2){
            for(int i=0;i<n1;i++){
                a[c1[i]]++;
                b[c2[i]]++;
            }
        }else return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}

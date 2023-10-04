package strings;

import java.util.Arrays;

public class InterleavingStrings {


    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        System.out.println(checkInterleaving( s1, s2, s3));
    }

    static boolean checkInterleaving(String a1,String a2,String s2){
        if((a1+a2).length()!=s2.length()){
            return false;
        }
        if((a1+a2).length()==0 && s2.length()==0){return true;}
        String s1 = a1+a2;
        int[] ar1 = new int[256];
        int[] ar2 = new int[256];
        Arrays.fill(ar1,0);
        Arrays.fill(ar2,0);
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        for(int i=0;i<=s1.length()-1;i++){
            ar1[c1[i]] = ar1[c1[i]] +1;
            ar2[c2[i]] = ar2[c2[i]] +1;
        }
        for(int i=0;i<=ar1.length-1;i++){
            if(ar1[i]!=ar2[i]){
                return false;
            }
        }
        return true;
    }
}

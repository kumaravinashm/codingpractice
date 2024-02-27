package strings;

public class IsSubsequence {
    public static void main(String[] args) {
        String s="abc";
        String t="sedrfafgvbtrftgcvgg";
        System.out.println(isSubsequence(s,t));
    }

    static boolean isSubsequence(String s,String t){
        int p1=0;
        int p2=0;
        while(p2<t.length()){
            if(s.charAt(p1)==t.charAt(p2)){
                p1++;
            }
            p2++;
            if (s.length()==p1) return true;
        }
        return false;


    }

}

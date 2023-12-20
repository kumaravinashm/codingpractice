package strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] s= {"This", "is", "an", "example", "of", "text", "justification."};
        int n= 16;
        System.out.println(reverse("aksbd    ihjfijwf loejwfiojweiof lw        jklwnef"));
    }

    static List<String> justify(String[] s,int n){
        String s1= "";
        List<String> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for(int i=0;i<=s.length-1;i++){
            if(s1.length()<=n && (s1+s[i]).length()<n){
                s1=s1+s[i]+" ";
                temp.add(s[i]);
            }else{
                res.add((s1));
                s1="";
                s1=s1+s[i]+" ";
            }

        }
        for (int i = 0; i <= (n-s1.length()); i++) {
            s1=s1+" ";
        }
        res.add((String.valueOf(s1)));
        return res;

    }


    static String reverse(String s){
        String[] sa = s.split("\\s+");
        String s1="";
        for(int i=sa.length-1;i>=0;i--){
            s1=s1+" "+sa[i];
        }
        return s1.trim();
    }
}

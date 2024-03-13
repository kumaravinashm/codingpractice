package strings;

import java.util.ArrayList;
import java.util.Locale;

public class KeyBoardRow {
    public static void main(String[] args) {
        String[] arr={"a","b"};

        System.out.println(getWords(arr));
    }

    static String[] getWords(String[] sarr){
        String a ="qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        String word="";
        ArrayList<String> al= new ArrayList<>();
        for(String s:sarr){
            char[] carr=s.toLowerCase().toCharArray();
            char cc=carr[0];
                if(a.contains(String.valueOf(cc))){
                    if (getWord(s,a)) al.add(s);
                }else if(b.contains(String.valueOf(cc))){
                    if (getWord(s,b)) al.add(s);
                }
                else if(c.contains(String.valueOf(cc))){
                    if (getWord(s,c)) al.add(s);
                }

        }
        String[] ans=new String[al.size()];
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            ans[i]=al.get(i);
        }
        return ans;
    }

    static boolean getWord(String s, String a) {
        boolean f = false;
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(a.contains(String.valueOf(c))){
                f=true;
            }else{ f=false; break;}
        }
        return f;
    }
}

package strings;

public class StringReverse {
    public static void main(String[] args) {
        String s = "halanfhnnngjfyfygyeuwhgguhdwkjdfkwdf";
        System.out.println(stringreverse(s));
    }

    static String stringreverse(String s){
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
            temp = temp+s.charAt(i);
        }
        return temp;
    }
}

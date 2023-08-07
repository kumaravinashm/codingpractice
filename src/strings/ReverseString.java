package strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "fhgh";
        String f = "";
        for(int i=s.length();i>=0;i--){
            if(i==0) break;
            f= f+s.charAt(i-1);
        }
        System.out.println(f);
    }
}

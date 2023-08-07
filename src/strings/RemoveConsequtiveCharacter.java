package strings;

public class RemoveConsequtiveCharacter {
    public static void main(String[] args) {
        String s = "ddddfffgggrrryyyuujjjkkoh";
        System.out.println(removeChar(s));
    }


    static String removeChar(String s){
        int n = s.length();
        char comp=s.charAt(0);
        String result = String.valueOf(s.charAt(0));
        for(int i=1;i<n-1;i++){
            if(s.charAt(i+1)!=comp){
                result = result+s.charAt(i+1);
                comp = s.charAt(i+1);

            }
        }
        return result;


    }
}

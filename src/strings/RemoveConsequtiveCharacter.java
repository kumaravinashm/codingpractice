package strings;

public class RemoveConsequtiveCharacter {
    public static void main(String[] args) {
        String s = "dgfffgggrrryyyuujjjkkoh";
        System.out.println(removeChar(s));
    }


     static String removeChar(String s){
        int n = s.length();
        String result = String.valueOf(s.charAt(0));
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                result = result+s.charAt(i+1);
            }
        }
        return result;
    }
}

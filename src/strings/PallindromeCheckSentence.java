package strings;

public class PallindromeCheckSentence {
    public static void main(String[] args) {
        String sArr = "A man, a plan, a canal: Panama";
        System.out.println(checkSentence(sArr));
    }

    static boolean checkSentence(String s) {
        String s1 = "";
        String s2 = s.toLowerCase();
        for (int i = 0; i < s2.length(); i++) {
            if (Character.isLetterOrDigit(s2.charAt(i))) {
                s1 = s1 + s2.charAt(i);
            }
        }
        int i=0,j=s1.length()-1;
        while (i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

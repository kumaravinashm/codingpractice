package strings;

public class PallindromeAfterDeletingOneCharacter {
    public static void main(String[] args) {
        String s="abna";
        System.out.println(checkPalindrome(s));
    }

    static boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return CheckPallindrome.isPalindrome(s.substring(i,j)) || CheckPallindrome.isPalindrome(s.substring(i+1,j+1));
        }
        return true;
    }


}

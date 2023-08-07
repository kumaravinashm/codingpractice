package strings;

public class CharactersForPallindrome {

    public static void main(String[] args) {
        String s = "BABABAA";
        int cnt = 0;
        int flag = 0;

        while(s.length()>0){
            if(CheckPallindrome.isPalindrome(s)){
                flag = 1;
                break;
            }else {
                cnt++;
                s = s.substring(0,s.length()-1);
            }
        }

        // print the number of insertion at front
        if (flag == 1) {
            System.out.println(cnt);
        }
    }
}

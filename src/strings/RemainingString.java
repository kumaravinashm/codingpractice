package strings;


//Given a string S without spaces, a character ch, and an integer count, the task is to find the string after the specified character has occurred count number of times.
//
//        Example 1:
//
//        Input:  S = "Thisisdemostring", ch = 'i',
//        count = 3
//        Output: ng
//        Explanation: Substring of S after the 3rd
//        occurrence of 'i' is "ng"


public class RemainingString {

    public static void main(String[] args) {
        System.out.println(getRemaining("y",'y',0));
    }

    private static String getRemaining(String s, char c, int i) {
        System.out.println(getIndex(s, c, i));
        int charIndex = getIndex(s, c, i);
        if(i==0){
            return s;
        }
        else if (charIndex == -1) {
            return "Empty string";
        } else if(s.substring(charIndex + 1, s.length()).length()==0){
            return "Empty string";
        }else {
            return s.substring(charIndex + 1, s.length());
        }
    }



    private static int getIndex(String s, char ch, int in){

        char[] c = s.toCharArray();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(c[i]==ch) {
                count = count + 1;
                if(count==in){
                    return i;
                }
            }
        }
        return -1;
    }


}

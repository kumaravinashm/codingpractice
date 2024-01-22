package strings;
//https://leetcode.com/problems/find-the-difference/
public class FindTheDifference {
    public static void main(String[] args) {
        String s="abcd";
        String t="abced";
        System.out.println(findTheDifference(s,t));
    }


    static char findTheDifference(String s,String t){
        int resultingChar=0;

        for (char c1:t.toCharArray()){

            resultingChar+= c1;
        }

        for (char c2:s.toCharArray()){

            resultingChar-= c2;
        }

        return (char)resultingChar;

    }
}

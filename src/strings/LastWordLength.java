package strings;

public class LastWordLength {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }


    static int lengthOfLastWord(String s) {
        String s1 = s.trim();
        String[] s2 = s.split("\\s+");
        return s2[s2.length-1].length();

    }

}

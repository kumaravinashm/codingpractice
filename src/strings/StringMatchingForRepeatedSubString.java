package strings;

public class StringMatchingForRepeatedSubString {

    public static void main(String[] args) {
        String s = "abcabcabcabcab";
        String nayi = s + s;
        String con = nayi.substring(1, nayi.length() - 1);
        System.out.println(con.contains(s));

    }
}

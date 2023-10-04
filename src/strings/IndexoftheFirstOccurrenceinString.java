package strings;

public class IndexoftheFirstOccurrenceinString {

    public static void main(String[] args) {
        System.out.println(strStr("mississippia","a"));

    }


    static int strStr(String haystack, String needle) {

        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+needle.length()).equals(needle)) return i;

            }
        }
        return -1;
    }
}

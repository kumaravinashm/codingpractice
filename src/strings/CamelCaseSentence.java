package strings;

public class CamelCaseSentence {
    public static void main(String[] args) {
        String input = "I got job at microsoft cFVFGHG BhugjgBBB";
        System.out.println(getCapitalize(input));
    }

    public static String getCapitalize(String sentence){
        String finalSen = "";
        String[] words = sentence.trim().split(" ");
        for (String w:
                words) {
            finalSen = finalSen+getCamelWord(w);
        }
        return finalSen;
    }

    static String getCamelWord(String s){
        s = s.trim();
        return s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase();
    }
}

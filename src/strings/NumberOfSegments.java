package strings;

public class NumberOfSegments {
    public static void main(String[] args) {
        String s="                ";
        System.out.println(countSegment(s));

    }
    static int countSegment(String s){
        if(s.trim().length()<1) return 0;
        String[] scarr = s.trim().split("\\s+");
        return scarr.length;

    }
}

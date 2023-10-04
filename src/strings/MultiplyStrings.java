package strings;

public class MultiplyStrings {


    public static void main(String[] args) {
        String s1="123456789";
        String s2="987654321";
        System.out.println(multiply(s1,s2));
    }

    static String multiply(String a, String b){

        double res = getLong(a)* getLong(b);
        return String.valueOf(res).split(".")[0];

    }

    static double getLong(String s){
        return Double.parseDouble(s);
    }
}

package strings;

import java.math.BigInteger;

public class SumOfTwoStrings {

    public static void main(String[] args) {
        System.out.println(findSum("234","5431"));
    }

    private static String findSum(String X, String Y) {
        BigInteger first = new BigInteger(X);
        BigInteger second = new BigInteger(Y);
//        int first = Integer.parseInt(s);
//        int second = Integer.parseInt(s1);
        return String.valueOf(first.add(second));
    }
}

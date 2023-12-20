package strings;

public class RomanToInteger {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(getInteger(s));
    }

    static int getInteger(String s) {
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = getValue(s.charAt(i));

            if (i < s.length() - 1 && currValue < getValue(s.charAt(i + 1))) {
                result -= currValue;
            } else {
                result += currValue;
            }
        }

        return result;

    }

    static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

}


//    Symbol       Value
//I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
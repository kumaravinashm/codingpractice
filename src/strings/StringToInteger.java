package strings;

public class StringToInteger {

    public static void main(String[] args) {
        String s = "-42   jwuehf ";
        System.out.println(getInt(s));
    }


    static int getInt(String ps) {

        String s = ps.trim();
        int i=0,sign=1;
        int result = 0;
        if(s.charAt(i)=='+'||s.charAt(i)=='-'){
            if(s.charAt(i)=='-'){
                sign = -1;

            }else{
                sign = 1;

            }
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-digit)/10){
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

}

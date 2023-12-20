package strings;

public class IntegerToRoman {
    public static void main(String[] args) {
        int n = 1994;
        String[] one = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] ten = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hun  = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tho  = {"","M","MM","MMM"};

        String ans = tho[n / 1000] + hun[(n%1000)/100] + ten[(n % 100) / 10] + one[(n % 10)];
        System.out.println(ans);

    }

}

package strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs";
        nonRepeating(str);
    }

    private static void nonRepeating(String str) {
        char c = 0;
        int len = str.length();
        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                c = i;
                break;
            }
            else {
                i += 1;
            }
        }
        System.out.println(c);

    }
}

package strings;

public class LargestAndSmallest {
    public static void main(String[] args) {
        String a = "Computer Science portal GeeksforGeeks fr Geeks g fed sdfghjkjhgfdfghmhgfdfghjhgf defrg erg35t3e 3er34t3f";

        minMaxLengthWords1(a);
        System.out.print("Minimum length word: "
                + minMaxLengthWords1(a)[0]
                + "\nMaximum length word: "
                + minMaxLengthWords1(a)[1]);
    }

    static String minWord = "", maxWord = "";


    public static String[] minMaxLengthWords1(String input) {
        String[] words = input.trim().split(" ");
        int mini = 0, maxi = 0;
        int max = words[0].length(), min = words[0].length();
        for (int i = 0; i< words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                maxi = i;
            }
            else if (words[i].length() < min) {
                min = words[i].length();
                mini = i;
            }}
        return new String[]{words[maxi],words[mini]};
    }
}


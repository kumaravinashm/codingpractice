package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;



//abhi nahi
//        hua hai
//        karna bacha
//        hua hai


public class LetterCombinationOfAPhonePad {

    public static void main(String[] args) {
        String s = "2345";
        LetterCombinationOfAPhonePad l = new LetterCombinationOfAPhonePad();
        System.out.println(l.letterCombinations(s));

    }

    List<String> res;

    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return new ArrayList<String>();
        }
        HashMap<Integer, ArrayList<String>> num = new HashMap<>();
        List<String> res = new LinkedList<>();

        //set up keypad matches
        for (int i = 1; i <= 9; i++) {
            ArrayList<String> list = new ArrayList<>();
            if (i == 1) {
                list.add("");
            } else if (i == 2) {
                list.add("a");
                list.add("b");
                list.add("c");
            } else if (i == 3) {
                list.add("d");
                list.add("e");
                list.add("f");
            } else if (i == 4) {
                list.add("g");
                list.add("h");
                list.add("i");
            } else if (i == 5) {
                list.add("j");
                list.add("k");
                list.add("l");
            } else if (i == 6) {
                list.add("m");
                list.add("n");
                list.add("o");
            } else if (i == 7) {
                list.add("p");
                list.add("q");
                list.add("r");
                list.add("s");
            } else if (i == 8) {
                list.add("t");
                list.add("u");
                list.add("v");
            } else if (i == 9) {
                list.add("w");
                list.add("x");
                list.add("y");
                list.add("z");
            }
            num.put(i, list);
        }

        helper(digits, num, res, 0, "");
        return res;
    }

    private void helper(String digits, HashMap<Integer, ArrayList<String>> num, List<String> res, int digitInd, String combine) {
        if (digitInd >= digits.length()) {
            res.add(combine);
            return;
        }
        int selected = Integer.parseInt(String.valueOf(digits.charAt(digitInd)));
        List<String> numLetters = num.get(selected);
        int originalLength = combine.length();
        for (String str : numLetters) {
            combine += str;
            helper(digits, num, res, digitInd + 1, combine);
            combine = combine.substring(0, originalLength);
        }
    }
}

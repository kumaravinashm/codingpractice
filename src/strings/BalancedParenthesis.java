package strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String s = "[]()}{";
        System.out.println(isBalanced(s));
    }


    static boolean isBalanced(String expr) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char checkokay;
            switch (c) {
                case '}':
                    checkokay = stack.pop();
                    if (checkokay == '(' || checkokay == '[') {
                        return false;
                    }
                    break;
                case ']':
                    checkokay = stack.pop();
                    if (checkokay == '(' || checkokay == '{') {
                        return false;
                    }
                    break;
                case ')':
                    checkokay = stack.pop();
                    if (checkokay == '{' || checkokay == '[') {
                        return false;
                    }
                    break;
            }

        }

        // Check Empty Stack
        return (stack.isEmpty());


    }
}

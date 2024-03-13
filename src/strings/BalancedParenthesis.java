package strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String s = "[](()){}";
        System.out.println(isBalanced(s));
        System.out.println(areBracketsBalanced(s));
    }


    static boolean isBalanced(String expr) {
        Deque<Character> dq = new ArrayDeque<>();
        for(int i=0;i<expr.length();i++){
            char c = expr.charAt(i);
            if(c=='('||c=='{'||c=='['){
                dq.push(c);
            }
            if(dq.isEmpty()) return false;
            char popped;
            switch (c){
                case '}':
                    popped = dq.pop();
                    if(popped=='('||popped=='[') return false;
                    break;
                case ')':
                    popped = dq.pop();
                    if(popped=='{'||popped=='[') return false;
                    break;
                case ']':
                    popped = dq.pop();
                    if(popped=='('||popped=='{') return false;
                    break;
            }
        }
        return dq.isEmpty();
    }

    public static boolean areBracketsBalanced(String s)
    {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else {
                if (i >= 0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}') || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;
    }
}

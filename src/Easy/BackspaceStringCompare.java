package Easy;

import java.util.Stack;

// https://leetcode.com/problems/backspace-string-compare/

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = backspaceStringStack(s);
        Stack<Character> s2 = backspaceStringStack(t);

        return s1.toString().equals(s2.toString());
    }

    private static Stack<Character> backspaceStringStack(String s) {
        Stack<Character> result = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '#') {
                if (!result.isEmpty()) {
                    result.pop();
                }
            } else {
                result.push(c);
            }
        }

        return result;
    }
}

package Easy;// https://leetcode.com/problems/remove-outermost-parentheses/

public class RemoveOutermostParentheses {

    public static String removeOuterParentheses(String s) {

        int par_start = 0, par_end = 0, lastIndex = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                par_start++;
            } else {
                par_end++;
            }

            if (par_start == par_end) {
                result += s.substring(lastIndex+1, i);
                par_start = 0;
                par_end = 0;
                lastIndex = i+1;
            }
        }

        return result;
    }
}

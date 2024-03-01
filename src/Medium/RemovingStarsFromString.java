package Medium;

import java.util.Stack;

// https://leetcode.com/problems/removing-stars-from-a-string/

public class RemovingStarsFromString {

    public String removeStars(String s) {
        Stack<Character> result = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '*') {
                if (!result.isEmpty()) {
                    result.pop();
                }
            } else {
                result.push(c);
            }
        }

        return result.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
    }
}

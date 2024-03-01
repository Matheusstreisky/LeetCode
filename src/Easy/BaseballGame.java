package Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/baseball-game/

public class BaseballGame {

    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();
        for (String operation : operations) {
            int index = scores.size()-1;

            switch (operation) {
                case "C":
                    scores.remove(index);
                    break;
                case "D":
                    scores.add(scores.get(index) * 2);
                    break;
                case "+":
                    scores.add(scores.get(index) + scores.get(index - 1));
                    break;
                default:
                    scores.add(Integer.parseInt(operation));
            }
        }

        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}

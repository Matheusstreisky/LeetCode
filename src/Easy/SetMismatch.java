package Easy;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(i+1, 0);
        }

        for (int j : nums) {
            numsMap.put(j, numsMap.get(j) + 1);
        }

        int[] result = new int[2];
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() > 2) {
                result[0] = entry.getKey();
            } else if (entry.getValue() == 1) {
                result[1] = entry.getKey();
            }
        }

        return result;
    }
}

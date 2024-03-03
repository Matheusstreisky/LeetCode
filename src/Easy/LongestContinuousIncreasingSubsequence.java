package Easy;

public class LongestContinuousIncreasingSubsequence {

    public static int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int biggerCount = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1])
                count++;
            else {
                if (count > biggerCount) {
                    biggerCount = count;
                }

                count = 1;
            }
        }

        return Math.max(count, biggerCount);
    }
}

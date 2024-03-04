package Easy;

public class MaximumAverageSubarray1 {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int sumMax = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            sumMax = Math.max(sumMax, sum);
        }

        System.out.println((double) sumMax / k);
        return (double) sumMax / k;
    }

//    ORIGINAL SOLUTION, WHICH WORKS, BUT GOT A "TIME LIMIT EXCEEDED" ERROR
//
//    public double findMaxAverage(int[] nums, int k) {
//        double average = Integer.MIN_VALUE, averageTemp;
//        int total = 0, count = 0;
//        int lenght = nums.length < k ? nums.length : nums.length-k+1;
//
//        for (int i = 0; i < lenght; i++) {
//            while (i + count < nums.length && count < k) {
//                total += nums[i + count];
//                count++;
//            }
//
//            averageTemp = (double) total / count;
//            total = 0;
//            count = 0;
//
//            if (averageTemp > average) {
//                average = averageTemp;
//            }
//        }
//
//        return average;
//    }
}

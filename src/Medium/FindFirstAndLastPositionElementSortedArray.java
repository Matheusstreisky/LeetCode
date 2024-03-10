package Medium;

public class FindFirstAndLastPositionElementSortedArray {

    public static void main(String[] args) {
        searchRange(new int[]{2,2}, 2);
//        searchRange(new int[]{5,7,7,8,8,10}, 8);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] positions = new int[]{-1, -1};

        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }

        for (int i = 0; i < nums.length; i++) {
            if (positions[0] == -1 && nums[i] == target) {
                positions[0] = i;
            }
            if (positions[1] == -1 && nums[nums.length - i - 1] == target) {
                positions[1] = nums.length - i - 1;
            }
        }

        return positions;
    }
}

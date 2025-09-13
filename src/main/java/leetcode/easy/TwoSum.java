package leetcode.easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("The sum of " + nums[i] + " and " + nums[j] + " equals to " + target);
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}

package leetcode.easy;
/*
 * Leetcode question 108: Convert sorted array to binary search tree
 * 
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a heigh-balanced search tree.
 * 
 * Constraints:
 * 1) 1 <= nums.length <= 10^4
 * 2) -10^4 <= nums[i] <= 10^4
 * 3) nums is sorted in a strictly increasing order.
 */

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums == null || nums.length == 0){
            return null;
        }

        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right){
        if(left > right){
            return null;
        }

        int mid = left + (right - left)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }
}

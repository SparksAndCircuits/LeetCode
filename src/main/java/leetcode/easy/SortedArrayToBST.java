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
        TreeNode root = new TreeNode();

        for(int i = 0; i < nums.length; i++){
            if(root == null){
                nums[i] = root.val;
            }else if(root.left == null){
                nums[i] = root.left.val;
            }else if(root.right == null){
                nums[i] = root.right.val;
            }else{
                sortedArrayToBST(nums);
            }
        }
        return root;
    }
}

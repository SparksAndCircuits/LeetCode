package leetcode.easy;

/*
 * LeetCode question 101: Symmetric tree
 * 
 * Given the root of a binary tree, check whether it is a mirror of itself (ie., symmetric around its center)
 * 
 * Constraints:
 * 1) The number of nodes in the tree is in the range [1, 1000]
 * 2) -100 <= Node.value <= 100
 */

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}

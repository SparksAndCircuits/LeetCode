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

        if (root.left == root.right) {
            if (root.left.left == root.right.right) {
                if (root.left.right == root.right.left) {
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }

    }
}

package leetcode.easy;
/*
 * Leetcode question 104 Maximum depth of a Binary Tree
 * 
 * Given the root of a binary tree, return its maximum depth.
 * 
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * 
 * Constraints:
 * 1) The number of nodes in the tree is in the range [0, 10^4].
 * 2) -100 <= Node.val <= 100
 */

public class MaxDepth {
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftDepth= maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}

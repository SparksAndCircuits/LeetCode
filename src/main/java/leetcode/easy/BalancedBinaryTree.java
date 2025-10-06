package leetcode.easy;
/*
 * Leetcode question 110: Balanced Binary Tree.
 * 
 * Given a binary tree, determine if it is height-balanced.
 * 
 * Constraints:
 * 1) The number of nodes in the tree is in the range [0, 5000]
 * 2) -10^4 <= Node.val <= 10^4
 */

import java.util.LinkedList;
import java.util.Queue;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

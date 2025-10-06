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
    public boolean isBalanced(TreeNode root){
        if(root == null){
            return false;
        }

        return BBTHeight(root.left, root.right);
    }

    private boolean BBTHeight(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        while(!queue.isEmpty()){
            if(left != null){
                queue.add(left);
            }

            if(right != null){
                queue.add(right);
            }
        }

        return BBTHeight(left, right);
    }
}

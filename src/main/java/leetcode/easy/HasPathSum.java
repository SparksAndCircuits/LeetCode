package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Leetcode question 112: Path Sum
 * 
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding all the values along the path equals targetSum.
 * 
 * A leaf is a node with no children.
 * 
 * Constraints:
 * 1) The number of nodes in the tree is in the range [0, 5000]
 * 2) -1000 <= Node.val <= 1000
 * 3) -1000 <= targetSum <= 1000
 */

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null){
            return false;
        }

        int temp = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.remove();

            for(int i = 0; i < queue.size(); i++){
                if(node.left != null){
                    temp = node.left.val;
                }

                if(node.right != null){
                    temp = node.right.val;
                }

                if(temp == targetSum){
                    return true;
                }
            }
        }

        return false;
    }
}
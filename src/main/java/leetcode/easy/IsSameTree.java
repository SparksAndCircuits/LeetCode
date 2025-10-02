package leetcode.easy;
/*
 * LeetCode question 100 Same Tree
 * 
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * 
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value
 */

import java.util.ArrayList;
import java.util.List;

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        return(p.val == q.val)&& isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}

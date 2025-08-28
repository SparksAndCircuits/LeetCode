/*
 * LeetCode question 108 Convert sorted array to binary search tree
 * 
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 * 
 */

import java.util.ArrayList;

public class sortedArrayToBST {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        ArrayList<TreeNode> children;
        TreeNode(){

        }
        TreeNode(int val){
            this.val = val;
            this.children = new ArrayList<TreeNode>();
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.right = right;
            this.left = left;
        }

        public void addChild(TreeNode node){
        this.children.add(node);
        }
        public TreeNode sortedArrayToBST(int[] nums){
            int ret;
            for(TreeNode node: this.children){
                System.out.println(val + 1);
            }
g 
            return left;
        }
    }
    

    
}

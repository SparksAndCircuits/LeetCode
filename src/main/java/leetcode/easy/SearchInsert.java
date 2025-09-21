package leetcode.easy;
/*
 * LeetCode question 35: Search Insert Position.
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return teh index where it should be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }else if(nums[i] > target){
                return i;
            }
            
        }

        return nums.length;
    }
}
package leetcode.easy;

/*
 * LeetCode question 26: Remove duplicates from a sorted array.
 * 
 * Given an integer array nums sorted in non-decending order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. The return the number of unique elements in nums.
 * 
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * 1) Change the array nums such that the first k elements of nums contains the unique elements in the order they ere present in nums inititally. The remaining elements of nums are not important as well as the size of nums.
 * 2) Return k
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int temp = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[temp]) {
                temp++;
                nums[temp] = nums[i];
            }
        }

        return temp + 1;
    }
}

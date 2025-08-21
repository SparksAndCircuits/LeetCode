/*
 * Leet Code question 26: Remove Duplicates from a sorted Array
 * Given an integer array nums sorted in non-decending order, remove the duplicates in-place such that each unique elementappears only once. The relative order of the elements should be kept the same. Then return the unique elements in nums.
 * 
 * Consider teh number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elemets of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return K
 */
public class removeDuplicates {
    public int removeDuplicates(int[] nums){
        int index = 1;
        for(int i = 1; i < nums.length; i++){
           if(nums[i] != nums[i - 1]){
            nums[index] = nums[i];
            index++;
           }
        }

        return index;
    }
}

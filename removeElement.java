/*
 * Leet code question 27: Remove ELement
 * Given an integer array nums and an integer value, remove all occurrences of value in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to value.
 * 
 * Consider the number of elements in nums which are not equal to value be k, to get accepted, you need to do the following things:
 *  -   Change the array nums such that the first k elements of nums contain the elements which are not equal to value. The remaining elements of nums are  not important as well as the size of nums.
 *  -   Return k.
 */
public class removeElement {
    public int removeElement(int[] nums, int value) {
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != value){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}

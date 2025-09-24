package leetcode.easy;
/*
 *  LeetCode question 66: plus one.
 * 
 *  You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's
 * 
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {
    public int[] plusOne(int[] digits){
        int[] results = null;
        for(int i = digits.length; i > 0; i--){
            int n = i - 1;
            int j;
           
            if(digits[i] <= 8){
                j = digits[i + 1];
                 results += digits[i];
            }else{
                digits[i] = 0;
                n = digits[i + 1];
            }

            return results;
        }
    }
}

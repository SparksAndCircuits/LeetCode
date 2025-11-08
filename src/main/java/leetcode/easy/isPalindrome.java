package leetcode.easy;

/*
 * Leetcode Question 9: Palindrome Number
 * 
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 * Constraints:
 * 1) -2^31 <= x <= 2^31 - 1
 */

public class isPalindrome {
    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }

        int original = x, reversed = 0;

        while(x> 0){
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return original == reversed;
    }
}

package leetcode.easy;
/*
 * LeetCode question 69: Sqrt(x)
 * 
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * 
 * You must not use any built in exponent funtion or operator. 
 */

public class MySqrt {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long left = 1;
        long right = x / 2;

        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid == x / mid) {
                return (int) mid;
            } else if (mid < x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) result;
    }
}

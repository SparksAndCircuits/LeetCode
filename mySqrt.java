/*
 * LeetCode question 69 Sqrt(x)
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. Teh returned integer should be non-negative as well.
 * 
 * You must not use any built in exponent funtion or operator.
 */
public class mySqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        mySqrt solution = new mySqrt();

        System.out.println(solution.mySqrt(4));
        System.out.println(solution.mySqrt(9));
        System.out.println(solution.mySqrt(16));
        System.out.println(solution.mySqrt(25));
        System.out.println(solution.mySqrt(8));
        System.out.println(solution.mySqrt(15));
        System.out.println(solution.mySqrt(24));
        System.out.println(solution.mySqrt(0));
        System.out.println(solution.mySqrt(1));
        System.out.println(solution.mySqrt(2));
        System.out.println(solution.mySqrt(2147395600));
        System.out.println(solution.mySqrt(2147483647));
    }
}

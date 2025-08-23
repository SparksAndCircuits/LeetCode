/*
 * Leetcode question 70 Climbing stairs.
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class climbStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int prev2 = 1;
        int prev1 = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        climbStairs solution = new climbStairs();

        System.out.println("n=1: " + solution.climbStairs(1));
        System.out.println("n=2: " + solution.climbStairs(2));
        System.out.println("n=3: " + solution.climbStairs(3));
        System.out.println("n=4: " + solution.climbStairs(4));
        System.out.println("n=5: " + solution.climbStairs(5));
        System.out.println("n=6: " + solution.climbStairs(6));

    }
}

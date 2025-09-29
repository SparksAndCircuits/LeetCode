package leetcode.easy;

/*
 * LeetCode question 70: Climbing Stairs
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int oneStepBack = 2;
        int twoStepBack = 1;
        int currentWays = 0;

        for (int i = 3; i <= n; i++) {
            currentWays = oneStepBack + twoStepBack;
            twoStepBack = oneStepBack;
            oneStepBack = currentWays;
        }

        return oneStepBack;
    }
}

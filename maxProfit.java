/*
 * Leetcode question 121 Best time to buy and sell stocks.
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell the stock.
 * 
 * Return teh maximum profit you can achieve from this transaction. If you cannot achieve any profit. Return 0;
 */

import java.util.Arrays;

public class maxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        maxProfit solution = new maxProfit();

        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        System.out.println("\nTest1: " + Arrays.toString(prices1));
        System.out.println("Expected: 5 (buy at 1, sell at 6)");
        System.out.println("Solution: " + solution.maxProfit(prices1));

        int[] prices2 = { 7, 6, 4, 3, 1 };
        System.out.println("\nTest2: " + Arrays.toString(prices1));
        System.out.println("Expected: 0 (prices only decrease)");
        System.out.println("Solution: " + solution.maxProfit(prices2));

        int[] prices3 = { 1, 2, 3, 4, 5 };
        System.out.println("\nTest3: " + Arrays.toString(prices3));
        System.out.println("Expected: 4 (buy at 1, sell at 5)");
        System.out.println("Solution: " + solution.maxProfit(prices3));
    }
}

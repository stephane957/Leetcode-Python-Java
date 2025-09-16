package java.SlidingWindow;

public class BuyAndSellStockII {
    /**
     * 122. Best Time to Buy and Sell Stock II
     * Difficulty: Medium
     * Topics: Array, Dynamic Programming, Greedy
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        // We want to compare the price of the current day with the previous day
        for (int i = 1; i < prices.length; i++) {
            // If the price of the current day is greater than the previous day, we can make a profit
            if (prices[i] > prices[i - 1]) {
                // We sell the stock
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}

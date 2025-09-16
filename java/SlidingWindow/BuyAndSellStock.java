package java.SlidingWindow;

public class BuyAndSellStock {
    /*
     * 121. Best Time to Buy and Sell Stock
     * Difficulty: Easy
     * Topics: Array, Dynamic Programming
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}

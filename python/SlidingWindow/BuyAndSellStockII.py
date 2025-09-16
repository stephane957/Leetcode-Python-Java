"""
122. Best Time to Buy and Sell Stock II
Difficulty: Easy
Topics: Array, Dynamic Programming, Greedy
"""
def maxProfit(prices: list[int]) -> int:
    profit = 0
    # We want to compare the price of the current day with the previous day
    for i in range(1, len(prices)):
        # if today's price is greater than yesterday's
        if prices[i] > prices[i-1]:
            # we sell the stock
            profit += prices[i] - prices[i-1]
    return profit
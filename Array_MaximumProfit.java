
//************************************************************************************************************************ */
/*
We are given an array of prices for a given stock. ith  element of this array represents the price of the stock on  day i.
We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.
Write a Java function to find the maximum profit.
  Note that a stock can’t be sold before buying.
  Example:
      Input: [8,3,3,1,4,9,12,11]
      Output: 11

  Explanation: Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12-1 = 11.
  Not 8-1 = 7, as the selling price needs to be larger than buying price.
   */

public class Array_MaximumProfit {

    public static void main(String[] args) {
        int[] arr = { 8, 3, 3, 1, 4, 9, 12, 11 };

        int min = arr[0]; // Stores the minimum price seen so far. Represents the best day to buy up to
                          // the current day
        int max = Integer.MIN_VALUE; // Stores maximum profit. The largest profit that has been found so far. It
                                     // stores profit, not stock price.

        // Single pass (O(n)) to calculate maximum profit
        for (int i = 0; i < arr.length; i++) {
            int profit = arr[i] - min; // Iterate over each day treating each as a potential selling price

            // i = current day index
            // arr[i] = price on that day

            if (profit > max) {
                max = profit; // Update max profit if this profit is higher
            }

            if (arr[i] < min) {
                min = arr[i]; // Update min price if today is cheaper
            }
        }

        System.out.println("Maximum profit: " + max);

        // Find the exact days to buy and sell
        int buy = 0, sell = 0;

        // Iterate over all pairs to find the days that produce the maximum profit
        for (int k = 0; k < arr.length; k++) {
            for (int j = k + 1; j < arr.length; j++) {
                if (arr[j] - arr[k] == max) { // If selling on day j after buying on day k gives max profit
                    buy = k + 1; // Day numbers are 1-based
                    sell = j + 1;
                }
            }
        }

        System.out.println("Buy on day " + buy + ", sell on day " + sell);

        /*
         * Integer.MIN_VALUE is used as a safe baseline.
         * It ensures correctness for any integer input.
         * It avoids edge cases with negative numbers.
         */
    }
}

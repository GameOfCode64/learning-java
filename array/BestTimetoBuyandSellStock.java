public class BestTimetoBuyandSellStock {
    // ! Best Time to Buy and Sell Stock
    // * Input -> [[7,1,5,3,6,4]]
    // * we have to return the max profit
    // bruit force
    static int maxProfit(int prices[]) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1 };
        int result = maxProfit(arr);
        System.out.println(result);
    }
}

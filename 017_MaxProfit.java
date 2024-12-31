public class MaxProfit {
    public static int maxProfit(Integer[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                System.out.println(prices[j] - prices[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Integer[] prices = {7, 1, 5, 3, 6, 4};
        maxProfit(prices);
    }
}

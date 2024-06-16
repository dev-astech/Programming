package Array.PopularQuestions;

public class MaximizeProfit {
    // My Approach
    public static void maxProfit(int[] priceHistory) {
        int maxProfit = Integer.MIN_VALUE;
        int buyDay = 0;
        int[] profits = new int[priceHistory.length - 1];
        for (int i = 0; i < priceHistory.length - 1; i++) {
            profits[i] = priceHistory[maxIndex(i + 1, priceHistory)] - priceHistory[i];
            if (profits[i] > maxProfit) {
                maxProfit = profits[i];
                buyDay = i;
            }
        }
        int sellDay = maxIndex(1, priceHistory);
        System.out.println("Buying day : " + (buyDay + 1) + "\nSelling day : " + (sellDay + 1) + "\nmax profit: " + maxProfit);
    }

    public static int maxIndex(int start, int[] priceHistory) {
        int maxPrice = Integer.MIN_VALUE;
        int sellIndex = 0;

        for (int i = start; i < priceHistory.length; i++) {
            if (priceHistory[i] > maxPrice) {
                maxPrice = priceHistory[i];
                sellIndex = i;
            }
        }
        return sellIndex;
    }

    //tutorial approach
    public static int buyAndSellStock(int[] priceHistory) {
        int len = priceHistory.length;
        int buyPrice = Integer.MAX_VALUE;
        int[] profitArray = new int[len];
        int maxProfit = 0;

        int buyingDay = 0, sellingDay = 0;

        for (int i = 0; i < len; i++) {
            if (buyPrice < priceHistory[i]) {
                profitArray[i] = priceHistory[i] - buyPrice;
                if (maxProfit < Math.max(profitArray[i], maxProfit)) {
                    maxProfit = Math.max(profitArray[i], maxProfit);
                    sellingDay = i;
                }
            } else {
                buyPrice = priceHistory[i];
                buyingDay = i;
            }
        }

        System.out.println("Buying Day: " + (buyingDay + 1) + "\nSelling Day: " + (sellingDay + 1));
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] priceHistory = {7, 1, 5, 3, 6, 4};
        System.out.println("From my approach");
        maxProfit(priceHistory);
        System.out.println("\nFrom tutorial approach");
        System.out.println("max profit: " + buyAndSellStock(priceHistory));
    }
}

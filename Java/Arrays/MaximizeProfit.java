public class MaximizeProfit {

    public static void maxProfit(int []priceHistory) {
        int maxProfit = Integer.MIN_VALUE;
        int buyDay = 0;
        int []profits = new int[priceHistory.length-1];
        for(int i=0;i<priceHistory.length-1;i++){
            profits[i] = priceHistory[maxIndex(i+1, priceHistory)] - priceHistory[i];
            if(profits[i]>maxProfit){
                maxProfit = profits[i];
                buyDay = i;
            }
        }
        int sellDay = maxIndex(1, priceHistory);
        System.out.println("profit: "+maxProfit+"\nbuy day is: "+(buyDay+1)+"\nsell day is: "+(sellDay+1));
    }

    public static int maxIndex(int start, int []priceHistory) {
        int maxPrice = Integer.MIN_VALUE;
        int sellIndex = 0;

        for(int i=start; i<priceHistory.length;i++){
            if(priceHistory[i]>maxPrice){
                maxPrice = priceHistory[i];
                sellIndex = i;
            }
        }

        return sellIndex;
    }

    public static void main(String[] args) {
        int []priceHistory = {100, 180, 260, 310, 40, 535, 695};
        maxProfit(priceHistory);
    }
}

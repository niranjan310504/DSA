public class Solution_122 {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int totalProfit=0;
        for(int i=1; i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                int profit = prices[i]-prices[i-1];
                totalProfit=totalProfit+profit;
            }
        }return totalProfit;
    }
    public static void main(String[] args) {
        int[]  prices ={7,1,5,3,6,4};
        int maxProfit= maxProfit(prices);
        System.out.println(maxProfit);
    }
}

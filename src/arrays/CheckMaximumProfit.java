package arrays;

public class CheckMaximumProfit {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(getMaxprofit(arr));
    }

    static int getMaxprofit(int[] prices){
        int least = Integer.MAX_VALUE;
        int profit = 0;
        int tempProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<least){
                least = prices[i];
            }
            tempProfit = prices[i]-least;
            if(tempProfit>profit){
                profit=tempProfit;
            }
        }
        return profit;
    }
}

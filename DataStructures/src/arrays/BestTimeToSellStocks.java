package arrays;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToSellStocks {

	public static void main(String[] args) {
		int[] prices =new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}
	
	public static int maxProfit(int[] prices) {
        int minPriceSoFar=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int price=prices[i];
            if(price<minPriceSoFar){
                minPriceSoFar=price;
            }
            if((price-minPriceSoFar)>maxProfit){
                maxProfit=price-minPriceSoFar;
            }
        }
        return maxProfit;
    }

}

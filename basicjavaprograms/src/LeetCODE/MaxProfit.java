package LeetCODE;

public class MaxProfit {
	
	 public static int maxProfit(int[] prices)
	   {
		 int min = prices[0];
		    int maxprofit = 0;
		    for (int i = 0; i < prices.length; i++) {
		         min = Math.min(min, prices[i]);        
		         maxprofit = Math.max(maxprofit, prices[i] - min);   
		    }

		    return maxprofit;     
	   }
	   public static void main(String[] args) {
	 
	   //int[] prices = {7, 1, 5, 3, 6, 4};
		 int[] prices = {5, 5, 5, 5, 5, 5};
	   System.out.println("Maximum profit after selling the stocks");
	   System.out.println(maxProfit(prices));
	   }
}

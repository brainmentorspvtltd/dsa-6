package arraydemos;

public class BuySellStock {

	public static void main(String[] args) {
		int prices[] = {7,6,4,3,1};
		int profit = 0; // Max Profit
		// Buying Prices
		int prefixMin [] = new int[prices.length];
		prefixMin[0] = prices[0]; // buying day
		for(int i = 1; i<prices.length; i++) {
		prefixMin[i] = Math.min(prefixMin[i-1],prices[i]);
		}
		for(int i : prefixMin) {
			System.out.print(i+" ");
			
		}
		int currentProfit = 0;
		// from next day till end
		for(int i = 1; i<prices.length; i++) {
			currentProfit = prices[i] - prefixMin[i-1];
			profit = Math.max(profit, currentProfit);
		}
		System.out.println("Max Profit is "+profit);
		

	}

}

package dp;

public class KnapSack {
	
	static int knapSack(int weights[], int values[],int index, int max){
		// Array of Weight Exhaust or bag space is 0
		// Termination Case
		if(index == weights.length || max == 0) {
			return 0;
		}
		
		// if current weight is > max weight
		if(weights[index]>max) {
			// move to the next weight
			return knapSack(weights, values, index+1, max);
		}
		else {
			// in this case current weight is less than the max weight
			// we have 2 option
			// 1. include the item in the bag
			int option1 = values[index] + knapSack(weights, values, index+1, max- weights[index]);
			// 2. not include the item in the bag
			int option2 = knapSack(weights, values, index+1, max);
			int result = Math.max(option1, option2);
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weights [] = {1,2,2};
		int items [] = {60,100,120};
		int MAX= 3;
		int result = knapSack(weights, items, 0, MAX);
		System.out.println(result);
		

	}

}

package recursion;

import java.util.ArrayList;

public class DiceGame {

	static ArrayList<String> diceRoll(int current, int endValue){
		// Termination Case
		if(current == endValue) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		// Boundary Case
		if(current>endValue) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		ArrayList<String> result = new ArrayList<>();
		// Roll Dice with all Possiblties
		for(int dice = 1; dice<=6; dice++) {
			int newValue = current + dice;
			ArrayList<String> temp =diceRoll(newValue, endValue);
			for(String t : temp) {
				result.add(dice +t );
			}
		}
		return result;
	}
	public static void main(String[] args) {
			System.out.println(diceRoll(0,10));

	}

}

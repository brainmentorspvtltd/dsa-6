package com.dit.dsa.mix;

public class WordSearch {
	
	static char board[][] = {
							{'A', 'B', 'C', 'E'},
							{'S', 'E', 'C', 'S'},
							{'A', 'D', 'E', 'E'}};
	
	public static boolean searchWord(int i, int j, int index, String word, char board[][])
	{
		//base case 
		if(index == word.length())
		{
			return true;
		}
		
		//boundary case
		if(i < 0 || i >= board.length || j < 0 || j >= board.length || word.charAt(index) != board[i][j])
		{
			return false;
		}
		
		if(
				searchWord(i + 1, j, index + 1, word, board) ||
				searchWord(i - 1, j, index + 1, word, board) ||
				searchWord(i, j + 1, index + 1, word, board) ||
				searchWord(i, j - 1, index + 1, word, board) ) 
		{
			return true;
		}
			
		return false;		
	}
	
	public static boolean exist(char board[][], String word)
	{
		int rows = board.length;
		int columns = board[0].length;
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				if(word.charAt(0) == board[i][j] && searchWord(i, j, 0, word, board))
				{
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = exist(board, "ABCCED") ? "Found" : "Not Found";
		
		System.out.println(result);

	}

}

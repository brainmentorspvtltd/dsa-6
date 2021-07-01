package backtracking;

public class NQueenCount {
	
	private static boolean isSafeToPlace(boolean chessBoard[][], int row, int col) {
		// Row Check , Col Check , Diagonal Check
		
		// Above Row
		for(int i = row; i>=0; i--) {
			if(chessBoard[i][col]) {
				return false;
			}
		}
		// Left Diagonal 
		for(int i = row, j= col; i>=0 && j>=0; i--, j--) {
			if(chessBoard[i][j]) {
				return false;
			}
		}
		
		// Right Diagonal 
				for(int i = row, j= col; i>=0 && j<chessBoard.length; i--, j++) {
					if(chessBoard[i][j]) {
						return false;
					}
				}
		return true;
	}
	
	static int countQueenPlacement(boolean chessBoard[][], int currentRow) {
		int count = 0;
		
		// Termination Case
		if(currentRow == chessBoard.length) {
			return 1; // Return 1 Count Possiblity
		}
		
		// current row and traverse all the cells
		for(int col = 0; col<chessBoard[currentRow].length; col++) {
			// before placing queen, just check row wise, col wise and diagonal wise
			if(isSafeToPlace(chessBoard, currentRow, col)) {
				chessBoard[currentRow][col] = true; // Queen Place
				count = count + countQueenPlacement(chessBoard, currentRow+1); // R.E
				chessBoard[currentRow][col] =  false; // Undo (Post Processing)
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean chessBoard[][] = new boolean[4][4]; // default value of boolean is false
		int count = countQueenPlacement(chessBoard, 0);
		System.out.println(count);
		// so board all cells are false by default

	}

}

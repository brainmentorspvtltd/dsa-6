package arraydemos;

public class ToeplitzMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {
				{1,2, 3 , 4},
				{5, 1, 2, 3},
				{10,5,1, 2}
		};
		for(int  i =0; i<matrix.length-1; i++) {
			for(int j = 0; j<matrix.length-1;j++ ) {
				if(matrix[i][j] != matrix[i+1][j+1]) {
					System.out.println("Not Toeplitz Matrix");
					return ;
				}
			}
		}
		System.out.println("Yes Toeplitz Matrix");

	}

}

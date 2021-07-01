package dp;

public class LCS {
	
	
	static int lcs (String s1, String s2) {
		
		// Termination Case
		if(s1.length()==0 || s2.length()==0) {
			return 0;
		}
		int count = 0;
		// case-1 when first char are same
		if(s1.charAt(0) == s2.charAt(0)) {
			//System.out.print(s1.charAt(0)+" ");
			count = 1 + lcs(s1.substring(1), s2.substring(1)); // R.E
		}
		else {
			// case-2 when char are not same
			int result1 = lcs(s1.substring(1), s2); //  R.E
			int result2 = lcs(s1, s2.substring(1)); // R.E 
			count = Math.max(result1, result2);
		}
		return count;
	}
	
	static int lcsMemo(String s1, String s2 , int m, int n, int [][] matrix) {
		// Termination case
		if(m==0 || n==0) {
			return 0;
		}
		// Cache - Inside Cache Value present
		if(matrix[m-1][n-1]!=0) {
			return matrix[m-1][n-1];
		}
		
		// case-1 when last char are same
		if(s1.charAt(m-1) == s2.charAt(n-1)) {
			matrix [m-1][n-1] = 1 + lcsMemo(s1, s2,m-1, n-1, matrix);
			return matrix[m-1][n-1];
		}
		else {
			// case-2 when last char are not same
			int result1 = lcsMemo(s1, s2, m-1, n, matrix);
			int result2 = lcsMemo(s1, s2, m, n-1, matrix);
			matrix[m-1][n-1] = Math.max(result1, result2);
			return matrix[m-1][n-1];
		}
	}
	
	static int lcsTab(String s1, String s2, int m , int n) {
		int matrix [][] = new int[m+1][n+1];
		for(int i = 0; i<=m; i++) {
			for (int j=0 ; j<=n;j++){
				if(i==0 || j==0) {
					matrix[i][j]=0;
				}
				else 
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					matrix[i][j] = 1  + matrix[i-1][j-1]; // Diagonal  + 1
				}
				else {
					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
				
			}
		}
		return matrix[m][n];
	}

	public static void main(String[] args) {
		// charAt
		// substring
		int len = lcs("ABCDGH","AEDFHR"); // ADH
		System.out.println(len);
		len = lcs("AGGTAB","GXTXAYB");
		System.out.println(len);

	}

}

public class KMP {
	public static void KMPSearch(String pat, String str)
	{
		int M = pat.length();
		int N = str.length();

		int lps[] = new int[M];
		int j = 0; // index for pat[]

		computeLPSArray(pat, M, lps);

		int i = 0; 
		while (i < N) {
			if (pat.charAt(j) == str.charAt(i)) {
				j++;
				i++;
			}
			if (j == M) {
				System.out.println("Found pattern at index " + (i - j));
				j = lps[j - 1];
			}

			else if (i < N && pat.charAt(j) != str.charAt(i)) {
				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
	}

	public static void computeLPSArray(String pat, int M, int lps[])
	{
		int j = 0;
		int i = 1;
		lps[0] = 0;

		while (i < M) {
			if (pat.charAt(i) == pat.charAt(j)) {
				j++;
				lps[i] = j;
				i++;
			}
			else 
			{
				if (j != 0) {
					j = lps[j - 1];
				}
				else
				{
					lps[i] = j;
					i++;
				}
			}
		}
	}

	public static void main(String args[])
	{
		String str = "abababcdabab";
		String pat = "abab";
		KMPSearch(pat, str);
	}
}


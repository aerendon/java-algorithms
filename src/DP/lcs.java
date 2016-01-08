/*
Inputs:
	x, y : String
	m : Tamaño de x
	n : Tamaño de y
Outputs:
	lcs
 */

public static int lcs(String x, String y, int m, int n) {
	int[][] L = new int[m+1][n+1];

	for (int i = 0; i <= m; i++) {
		for (int j = 0; j <= n; j++) {
			if (i == 0 || j == 0) L[i][j] = 0;
			else if (x.charAt(i - 1) == y.charAt(j - 1)) L[i][j] = L[i - 1][j - 1] + 1;
			else L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
		}
	}
	return L[m][n];
}

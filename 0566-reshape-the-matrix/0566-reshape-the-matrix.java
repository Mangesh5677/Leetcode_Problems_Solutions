class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int n = mat.length;
        int m = mat[0].length;

        // Check if reshape is possible
        if (n * m != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                ans[index / c][index % c] = mat[i][j];

                index++;
            }
        }

        return ans;
    }
}
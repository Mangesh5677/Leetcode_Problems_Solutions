class Solution {
    public int numSpecial(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 1) {

                    int rowCount = 0;
                    int colCount = 0;

                    // Count 1's in the row
                    for (int k = 0; k < m; k++) {
                        if (mat[i][k] == 1) {
                            rowCount++;
                        }
                    }

                    // Count 1's in the column
                    for (int k = 0; k < n; k++) {
                        if (mat[k][j] == 1) {
                            colCount++;
                        }
                    }

                    // Check if it is special
                    if (rowCount == 1 && colCount == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
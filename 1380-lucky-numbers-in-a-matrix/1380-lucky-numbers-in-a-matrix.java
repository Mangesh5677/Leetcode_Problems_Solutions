class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {

            // Find minimum in current row
            int min = matrix[i][0];
            int col = 0;

            for (int j = 1; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            // Check if min is maximum in its column
            boolean isLucky = true;

            for (int k = 0; k < n; k++) {
                if (matrix[k][col] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                ans.add(min);
            }
        }

        return ans;
    }
}
class Solution {

    int paths = 0;
    int[][] dir = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    public int uniquePathsIII(int[][] grid) {

        int startRow = 0;
        int startCol = 0;
        int cells = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] != -1)
                    cells++;

                if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                }
            }
        }

        dfs(grid, startRow, startCol, cells);

        return paths;
    }

    void dfs(int[][] grid, int r, int c, int remain) {

        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
            return;

        if (grid[r][c] == -1)
            return;

        if (grid[r][c] == 2) {
            if (remain == 1)
                paths++;
            return;
        }

        int temp = grid[r][c];
        grid[r][c] = -1;

        for (int[] d : dir) {
            dfs(grid, r + d[0], c + d[1], remain - 1);
        }

        grid[r][c] = temp;
    }
}
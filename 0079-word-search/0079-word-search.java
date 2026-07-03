class Solution {
    public boolean exist(char[][] board, String word) {

        int[][] track = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0)) {
                    if (find(i, j, 0, word, board, track)) {
                        return true;
                    }
                }

            }
        }

        return false;
    }

    public static boolean find(int r, int c, int idx, String word,char[][] board, int[][] track) {

        // All characters matched
        if (idx == word.length()) {
            return true;
        }

        // Boundary check
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) {
            return false;
        }

        // Already visited
        if (track[r][c] == 1) {
            return false;
        }

        // Character mismatch
        if (board[r][c] != word.charAt(idx)) {
            return false;
        }

        // Mark visited
        track[r][c] = 1;

        boolean ans = find(r + 1, c, idx + 1, word, board, track) ||
                      find(r - 1, c, idx + 1, word, board, track) ||
                      find(r, c + 1, idx + 1, word, board, track) ||
                      find(r, c - 1, idx + 1, word, board, track);

        // Backtrack
        track[r][c] = 0;

        return ans;
    }
}
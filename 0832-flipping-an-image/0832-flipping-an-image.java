class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;

        // Reverse every row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                left++;
                right--;
            }
        }

        // Invert every bit
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] ^= 1;
            }
        }

        return image;
    }
}
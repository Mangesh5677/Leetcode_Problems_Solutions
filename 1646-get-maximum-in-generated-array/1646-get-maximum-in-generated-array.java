class Solution {
    public int getMaximumGenerated(int n) {
        int[] arr = new int[n + 1];
        if (n == 0)
            return 0;
        arr[0] = 0;
        arr[1] = 1;

        int max = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (2 * i <= n) {
                arr[2 * i] = arr[i];
                max = Math.max(max, arr[2 * i]);
            }

            if (2 * i + 1 <= n) {
                arr[2 * i + 1] = arr[i] + arr[i + 1];
                max = Math.max(max, arr[2 * i + 1]);
            }
        }
        return max;
    }
}
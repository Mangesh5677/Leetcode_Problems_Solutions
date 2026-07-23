class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int freq = 1;
        int ans = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                if (freq == arr[i - 1]) {
                    ans = arr[i - 1];
                }
                freq = 1;
            }
        }

        if (freq == arr[n - 1]) {
            ans = arr[n - 1];
        }
        return ans;
    }
}
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] ans = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                ans[j] = triangle.get(i).get(j) + Math.min(ans[j], ans[j + 1]);
            }
        }
        return ans[0];
    }
}
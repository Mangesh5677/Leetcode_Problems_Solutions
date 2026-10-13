class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int ht = Math.min(height[left], height[right]);
            int currWater = width * ht;
            maxWater = Math.max(maxWater, currWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}

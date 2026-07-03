class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];

        find(new ArrayList<>(), nums, l, arr);

        return l;
    }

    public static void find(List<Integer> ans, int nums[],
                            List<List<Integer>> l, boolean arr[]) {

        if (ans.size() == nums.length) {
            l.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (arr[i] == false) {

                arr[i] = true;
                ans.add(nums[i]);

                find(ans, nums, l, arr);

                ans.remove(ans.size() - 1);
                arr[i] = false;
            }
        }
    }
}
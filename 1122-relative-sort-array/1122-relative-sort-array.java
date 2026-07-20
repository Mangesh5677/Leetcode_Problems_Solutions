class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    ans.add(arr1[j]);
                    arr1[j] = -1; 
                }
            }
        }
        Arrays.sort(arr1);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                ans.add(arr1[i]);
            }
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
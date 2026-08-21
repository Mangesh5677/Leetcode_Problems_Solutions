class Solution {
    public String largestEven(String s) {
        int lastTwoIndex = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                lastTwoIndex = i;
                break;
            }
        }
        if (lastTwoIndex == -1) {
            return "";
        }

        return s.substring(0, lastTwoIndex + 1);
    }
}
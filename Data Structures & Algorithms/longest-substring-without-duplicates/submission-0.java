class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            for (int i = left; i < right; i++) {
                if (s.charAt(i) == s.charAt(right)) {
                    left = i + 1; 
                    break;
                }
            }

            int windowLen = right - left + 1;

            if (windowLen > maxLen) {
                maxLen = windowLen;
            }
        }

        return maxLen;
    }
}
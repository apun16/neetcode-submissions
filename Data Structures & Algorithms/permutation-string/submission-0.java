class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) 
            return false;
        int[] need = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        int k = s1.length();

        for (int right = 0; right < s2.length(); right++) {
            window[s2.charAt(right) - 'a']++;

            if (right - left + 1 > k) {
                window[s2.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == k) {
                boolean ok = true;

                for (int i = 0; i < 26; i++) {
                    if (need[i] != window[i]) {
                        ok = false;
                        break;
                    }
                }

                if (ok) 
                    return true;
            }
        }

        return false;
    }
}
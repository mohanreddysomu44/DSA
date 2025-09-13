import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String str) {
        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < str.length()) {
            char ch = str.charAt(right);
            if (!seen.contains(ch)) {
                seen.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                seen.remove(str.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}
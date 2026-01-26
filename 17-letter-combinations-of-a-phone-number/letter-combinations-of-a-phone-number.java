import java.util.*;

class Solution {
    List<String> out = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return out;

        String[] lett = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        solve(digits, 0, "", lett);
        return out;
    }

    void solve(String digits, int ind, String ans, String[] lett) {
        // Base case: if we've processed all digits
        if (ind >= digits.length()) {
            out.add(ans);
            return;
        }

        int num = digits.charAt(ind) - '0';
        String letter = lett[num];

        for (int i = 0; i < letter.length(); i++) {
            // Recurse with current character appended
            solve(digits, ind + 1, ans + letter.charAt(i), lett);
        }
    }
}
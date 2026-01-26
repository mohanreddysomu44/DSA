import java.util.*;

class Solution {
    List<String> out = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return out;

        String[] lett = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        StringBuilder sb = new StringBuilder();
        solve(digits, 0, sb, lett);
        return out;
    }

    void solve(String digits, int ind, StringBuilder sb, String[] lett) {
        if (ind == digits.length()) {
            out.add(sb.toString());
            return;
        }

        int num = digits.charAt(ind) - '0';
        String letter = lett[num];

        for (int i = 0; i < letter.length(); i++) {
      
            sb.append(letter.charAt(i));

            solve(digits, ind + 1, sb, lett);

            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
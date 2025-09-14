class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        int n = s.length();
        String[][] arr = new String[numRows][n];

        for (int i = 0; i < numRows; i++) {
            Arrays.fill(arr[i], "");
        }

        int row = 0, col = 0;
        boolean down = true;

        for (int k = 0; k < n; k++) {
            arr[row][col] = String.valueOf(s.charAt(k));

            if (down) {
                if (row < numRows - 1) {
                    row++;
                } else {
                    down = false;
                    row--;
                    col++;
                }
            } else {
                if (row > 0) {
                    row--;
                    col++;
                } else {
                    down = true;
                    row++;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                ans.append(arr[i][j]);
            }
        }

        return ans.toString();
    }
}
class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        const int MAX = 1001; 
        int mat[MAX][MAX] = {0};

        int m = text1.size();
        int n = text2.size();
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (text1[i] == text2[j]) {
                    mat[i][j] = 1 + mat[i + 1][j + 1];
                } else {
                    mat[i][j] = (mat[i + 1][j] > mat[i][j + 1]) ? mat[i + 1][j] : mat[i][j + 1];
                }
            }
        }

        return mat[0][0];
    }
};
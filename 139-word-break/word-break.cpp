class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        vector<bool> mem(s.size() + 1, false);
        mem[0] = true;

        unordered_set<string> store(wordDict.begin(), wordDict.end());

        for (int i = 1; i <= s.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (mem[j] && store.count(s.substr(j, i - j))) {
                    mem[i] = true;
                    break;
                }
            }
        }

        return mem[s.size()];
    }
};
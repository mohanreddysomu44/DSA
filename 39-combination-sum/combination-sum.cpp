class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> res;
        vector<int> l;
        backtrack(candidates, target, res, l, 0);
        return res;
    }

    void backtrack(vector<int>& candidates, int target, vector<vector<int>>& res, vector<int>& l, int ind) {
        if (target == 0) {
            res.push_back(l);
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = ind; i < candidates.size(); i++) {
            if (target >= candidates[i]) {
                l.push_back(candidates[i]);
                backtrack(candidates, target - candidates[i], res, l, i);
                l.pop_back();
            }
        }
    }
};
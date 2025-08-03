class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int num = 0;
        for (int i = 0; i < nums.size(); i++) {
            num ^= nums[i];
        }

    unsigned int leftbit = num & -static_cast<unsigned int>(num);

        int x = 0, y = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (leftbit & nums[i]) {
                x ^= nums[i];
            } else {
                y ^= nums[i];
            }
        }

        return {x, y};
    }
};
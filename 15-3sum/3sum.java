import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate num1
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int num1 = nums[i];
            int st = i + 1, end = nums.length - 1;

            while (st < end) {
                int sum = num1 + nums[st] + nums[end];

                if (sum == 0) {
                    ans.add(Arrays.asList(num1, nums[st], nums[end]));

                    // Skip duplicates for st and end
                    while (st < end && nums[st] == nums[st + 1]) st++;
                    while (st < end && nums[end] == nums[end - 1]) end--;

                    st++;
                    end--;
                } else if (sum < 0) {
                    st++;
                } else {
                    end--;
                }
            }
        }
        return ans;
    }
}
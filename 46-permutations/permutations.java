class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(nums, 0, ans);
        return ans;
    }

    public void findPermutations(int[] nums, int ind, List<List<Integer>> ans) {
        if (ind == nums.length) {
            List<Integer> each = new ArrayList<>();
            for (int num : nums) {
                each.add(num);
            }
            ans.add(each);
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            swap(nums, i, ind);
            findPermutations(nums, ind + 1, ans);
            swap(nums, i, ind); // backtrack
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
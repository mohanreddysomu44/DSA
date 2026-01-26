class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;
        int resultsum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int st = i + 1, end = nums.length - 1;
            while (st < end) {
                int sum = nums[i] + nums[st] + nums[end];
                int diff = Math.abs(sum - target);

                if (diff < mindiff) {
                    resultsum = sum;
                    mindiff = diff;
                }

                if (sum == target) {
                    return sum; 
                } else if (sum < target) {
                    st++;
                } else {
                    end--;
                }
            }
        }
        return resultsum;
    }
}
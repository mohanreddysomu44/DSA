class Solution {
    public boolean canSplit(int max, int[] nums, int k) {
        int count = 1; 
        int sum = 0;
        for (int num : nums) {
            if (sum + num > max) {
                count++;
                sum = num; 
            } else {
                sum += num;
            }
        }
        return count <= k;
    }

    public int splitArray(int[] nums, int k) {
        int st = 0, end = 0;
        for (int num : nums) {
            st = Math.max(st, num); 
            end += num;             
        }

        int ans = end;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (canSplit(mid, nums, k)) {
                ans = mid;
                end = mid - 1; 
            } else {
                st = mid + 1;  
            }
        }
        return ans;
    }
}
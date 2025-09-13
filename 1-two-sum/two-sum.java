class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int com=target-nums[i];
            if(dp.containsKey(com)){
                return new int[]{dp.get(com),i};
            }
            dp.put(nums[i],i);
        }
        return new int[]{};
    }
}
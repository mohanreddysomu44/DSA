class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < nums.length; ) {
            int val = nums[i];
            if (nums[i] != nums[val - 1]) {
                int temp = nums[val - 1];
                nums[val - 1] = nums[i];
                nums[i] = temp;
            } else {
                i++;  
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                li.add(i + 1);
            }
        }

        return li;
    }
}
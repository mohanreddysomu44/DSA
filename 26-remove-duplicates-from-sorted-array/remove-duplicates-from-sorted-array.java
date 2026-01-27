class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        List<Integer> li=new ArrayList<>();
        //    li.add(nums[0]);
        for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    count++;
                }else{
                    li.add(nums[i-1]);
                }
        }
        li.add(nums[nums.length-1]);
        int j=0;
        for(int val:li){
            nums[j]=val;
            j++;
        }

        return j;
         
    }
}
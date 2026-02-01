class Solution {
    public int findPeakElement(int[] nums) {
        int st=0,end=nums.length-1;

        while(st<end){
            int mid=st+(end-st)/2;

              if(nums[mid]>nums[mid+1]){

                   end=mid;
              }else if(nums[mid]<nums[mid+1]){
                   st=mid+1;
              }
        }

        return st;
    }
}
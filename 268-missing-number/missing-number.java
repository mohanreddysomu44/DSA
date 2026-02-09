class Solution {
    public int missingNumber(int[] nums) {
        
        int i=0;
        int n=nums.length;

          while(i<n){
              if(nums[i] <n && nums[i]!=i){
                  int ind=nums[i];
                  int temp=nums[ind];
                  nums[ind]=nums[i];
                  nums[i]=temp;
              }else{
                 i++;
              }
          }
            int j;
          for( j=0;j<n;j++){
               if(nums[j]!=j){
                  return j;
               }
          }

          return j;
    }
}
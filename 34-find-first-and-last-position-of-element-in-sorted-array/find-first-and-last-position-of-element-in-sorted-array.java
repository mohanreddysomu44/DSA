class Solution {
     public static int firstEle(int [] nums,int target){
            int ans=-1;
            int st=0,end=nums.length-1;

            while(st<=end){
                int mid=st+(end-st)/2;

                  if(nums[mid]==target){
                      ans=mid;
                      end=mid-1;
                  }else if(nums[mid]<target){
                    st=mid+1;
                  }else{
                      end=mid-1;
                  }
            }

            return ans;
     }

     public static int secondEle(int nums[],int target){
            int ans=-1;
            int st=0,end=nums.length-1;

            while(st<=end){
                int mid=st+(end-st)/2;

                 if(nums[mid]==target){
                      ans=mid;
                      st=mid+1;
                 }else if(nums[mid]<target){
                      st=mid+1;
                 }else{
                     end=mid-1;
                 }
            }

            return ans;
     }
    public int[] searchRange(int[] nums, int target) {
        
          int first=firstEle(nums,target);
          int second=secondEle(nums,target);

          return new int[]{first,second};
    }
}
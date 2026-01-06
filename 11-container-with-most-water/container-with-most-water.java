class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
          while(left<right){
              int width=right-left;
              int max=Math.min(height[left],height[right]);
              ans=Math.max(ans,width*max);

               if(height[left]<=height[right]){
                left++;
               }else{
                right--;
               }
          }
          return ans;
    }
}